<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <p>name: ${name}</p>
    <p>age:${age}</p>

    <form action="/form" method="post">
        firstName: <input type="text" name="firstName"/> <br/>
        lastName: <input type="text" name="lastName"/> <br/>
        username: <input type="text" name="username"/> <br/>
        password: <input type="password" name="password"/> <br/>
        <button type="submit" value="submit">submit</button>
    </form>
</body>
</html>