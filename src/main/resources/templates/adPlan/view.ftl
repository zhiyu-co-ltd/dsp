<html>
<head>
    <title>广告计划</title>
    <link href="${request.contextPath}/static/css/style.css" rel="stylesheet" type="text/css"/>
</head>
<body style="margin-top:50px;overflow: hidden;">
<form action="${request.contextPath}/adPlans/save" method="post">
    <input type="hidden" name="id" value="<#if adPlan.id??>${adPlan.id}</#if>"/>
    <table class="gridtable" style="width:800px;">
        <tr>
            <th colspan="5">广告计划 - [<a href="${request.contextPath}/adPlans">返回</a>]</th>
        </tr>
        <tr>

            <th>用户标识：</th>
            <td><input type="text" name="userId" value="<#if adPlan.userId??>${adPlan.userId}</#if>"/>
            </td>
            <th>计划名称：</th>
            <td><input type="text" name="name" value="<#if adPlan.name??>${adPlan.name}</#if>"/>
            </td>
            <th>状态：</th>
            <td><input type="text" name="status" value="<#if adPlan.status??>${adPlan.status}</#if>"/>
            </td>
            </tr>
        <tr>
            <th>日限额：</th>
            <td><input type="text" name="dayConst" value="<#if adPlan.dayConst??>${adPlan.dayConst}</#if>"/>
            </td>
            <th>实时余额：</th>
            <td><input type="text" name="realtimeMoney" value="<#if adPlan.realtimeMoney??>${adPlan.realtimeMoney}</#if>"/>
            </td>
            <th>推广计划ID：</th>
            <td><input type="text" name="adplanId" value="<#if adPlan.adplanId??>${adPlan.adplanId}</#if>"/>
            </td>

        </tr>
        <tr>
            <td><input type="submit" value="保存"/></td>
        </tr>
    <#if msg??>
        <tr style="color:#00ba00;">
            <th colspan="5">${msg}</th>
        </tr>
    </#if>
    </table>
</form>
</body>
</html>
