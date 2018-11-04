<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8" />
    <title>测试Flt模板引擎</title>
</head>
<body>

    <h1>
     测试Flt模板引擎
    </h1>
<table>
    <tr>
        <th>姓名</th>
        <th>密码</th>
        <th>id</th>
        <th>性别</th>
    </tr>
    <#list userList as user>
    <tr>
        <td>
            ${user.userName}
        </td>
        <td>
            ${user.userPwd}
        </td>
        <td>
            ${user.userId}
        </td>
        <td>
           <#if user.sex=1>
               男
               <#elseif user.sex=0>
               女
               <#else >
                其他
           </#if>
        </td>
    </tr>
    </#list>
</table>

</body>
</html>
