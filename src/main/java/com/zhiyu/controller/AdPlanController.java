/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014-2016 abel533@gmail.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.zhiyu.controller;

import com.github.pagehelper.PageInfo;
import com.zhiyu.model.AdPlan;
import com.zhiyu.service.AdPlanService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;


@Controller
@RequestMapping("/adPlans")
public class AdPlanController {
    Logger log = Logger.getLogger(AdPlanController.class);

    @Autowired
    private AdPlanService adPlanServiceImpl;

    @RequestMapping
    public ModelAndView getAll(AdPlan adPlan) {
        ModelAndView result = new ModelAndView("adPlan/index");
        List<AdPlan> adPlanList = adPlanServiceImpl.getAll(adPlan);
        result.addObject("pageInfo", new PageInfo<AdPlan>(adPlanList));
        result.addObject("queryParam", adPlan);
        result.addObject("page", adPlan.getPage());
        result.addObject("rows", adPlan.getRows());
        return result;
    }


    @RequestMapping(value = "/query")
    public ModelAndView query(@RequestParam(value = "userId", required = false) String userId,@RequestParam(value = "name", required = false) String name) {
        ModelAndView result = new ModelAndView("adPlan/index");
        log.info(">>>>>>>"+userId+"  "+name);
        List<AdPlan> adPlanList = adPlanServiceImpl.query(userId,name);
        result.addObject("pageInfo", new PageInfo<AdPlan>(adPlanList));
        result.addObject("userId", userId);
        result.addObject("name", name);
        return result;
    }

    @RequestMapping(value = "/add")
    public ModelAndView add() {
        ModelAndView result = new ModelAndView("adPlan/view");
        result.addObject("adPlan", new AdPlan());
        return result;
    }

    @RequestMapping(value = "/view/{id}")
    public ModelAndView view(@PathVariable Integer id) {
        ModelAndView result = new ModelAndView("adPlan/view");
        AdPlan adPlan = adPlanServiceImpl.getById(id);
        result.addObject("adPlan", adPlan);
        return result;
    }

    @RequestMapping(value = "/delete/{id}")
    public ModelAndView delete(@PathVariable Integer id, RedirectAttributes ra) {
        ModelAndView result = new ModelAndView("redirect:/adPlans");
        adPlanServiceImpl.deleteById(id);
        ra.addFlashAttribute("msg", "删除成功!");
        return result;
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ModelAndView save(AdPlan adPlan) {
        ModelAndView result = new ModelAndView("adPlan/view");
        String msg = adPlan.getId() == null ? "新增成功!" : "更新成功!";
        adPlanServiceImpl.save(adPlan);
        result.addObject("adPlan", adPlan);
        result.addObject("msg", msg);
        return result;
    }
}
