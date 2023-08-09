<%@ page isELIgnored="false"%>
page scope atr1 value=${pageScope.atr1}<br>
request scope atr2 value=${requestScope.atr2}<br>
session scope atr3 value=${sessionScope.atr3}<br>
application scope atr4 value=${applicationScope.atr4}<br>

cookie name=${cookie.JSESSIONID.name}<br>
cookie value(sessionid)=${cookie.JSESSIONID.value}<br>

context param dbuser value:${initParam.dbuser}<br>
context param dbpassword value:${initParam.dbpassword}<br>


