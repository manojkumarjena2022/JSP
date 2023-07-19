<b>Static Block,jspInit(),jspDestroy()</b>
<%!
  static{
    System.out.println("other_declaration :: Static block");
  }
  public other_005fdeclaration_jsp()
  {
    System.out.println("other_declaration :: Constructor");
  }
public void jspInit()
{
    System.out.println("other_declaration :: jspInit()  method");
}
public void jspDestroy()
{
    System.out.println("other_declaration :: jspDestroy()  method");
}
 %>
 <%  System.out.println("other_declaration :: _jspService()  method"); %>
 <br><b>Inner Class</b>
 <%! 
 class Test
 {
 int a=70;

 } 
 %>
