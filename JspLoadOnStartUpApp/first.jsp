<b>Load On Start Up Test</b>
<%!
  static{
    System.out.println("first_jsp :: Static block");
  }
  public first_jsp()
  {
    System.out.println("first_jsp :: Constructor");
  }
public void jspInit()
{
    System.out.println("first_jsp :: jspInit()  method");
}
public void jspDestroy()
{
    System.out.println("first_jsp :: jspDestroy()  method");
}
 %>
 <%  System.out.println("first_jsp :: _jspService()  method"); %>
 date & Time :: <%=new java.util.Date() %>

