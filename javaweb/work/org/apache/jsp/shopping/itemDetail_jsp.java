/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.10
 * Generated at: 2018-08-22 14:36:11 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.shopping;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import jwb.novice.javaweb.shopping.Order;
import java.util.Iterator;
import jwb.novice.javaweb.shopping.Item;
import jwb.novice.javaweb.shopping.ItemDetailViewModel;

public final class itemDetail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.Iterator");
    _jspx_imports_classes.add("jwb.novice.javaweb.shopping.Order");
    _jspx_imports_classes.add("jwb.novice.javaweb.shopping.Item");
    _jspx_imports_classes.add("jwb.novice.javaweb.shopping.ItemDetailViewModel");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<style>\r\n");
      out.write("* {\r\n");
      out.write("\tbox-sizing : border-box;\r\n");
      out.write("\tpadding : 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".cart-container {\r\n");
      out.write("\theight : 100%;\r\n");
      out.write("\twidth : 100%;\r\n");
      out.write("\tbackground : rgba(0, 0, 0, 0.5);\r\n");
      out.write("\tposition : absolute;\r\n");
      out.write("\ttop : 0;\r\n");
      out.write("\tleft : 0;\r\n");
      out.write("\tpadding : 1.5rem;\r\n");
      out.write("\tdisplay : none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".shopping-cart {\r\n");
      out.write("\theight : 100%;\r\n");
      out.write("\twidth : 100%;\r\n");
      out.write("\tbackground : rgba(255, 255, 255, 1.0);\r\n");
      out.write("\tposition : relative;\r\n");
      out.write("\ttop : 0;\r\n");
      out.write("\tleft : 0;\r\n");
      out.write("\tpadding : 1.0rem;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("table {\r\n");
      out.write("\twidth : 75%;\r\n");
      out.write("\tborder-collapse : collapse;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("thead tr {\r\n");
      out.write("\tbackground-color : #80cfcf;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("td {\r\n");
      out.write("\tborder-bottom : 1px solid #000000;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("button {\r\n");
      out.write("\tpadding : 0.50rem 1.00rem;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function setVisiblity(isVisible) {\r\n");
      out.write("\t\r\n");
      out.write("\tif (isVisible) {\r\n");
      out.write("\r\n");
      out.write("\t\tdocument.getElementById('cart-container').style.display = \"block\";\r\n");
      out.write("\t} else {\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tdocument.getElementById('cart-container').style.display = \"none\";\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body onload=\"setVisiblity(");
      out.print( (Boolean)request.getAttribute("cartVisiblity") );
      out.write(")\">\r\n");
      out.write("\t");

	ItemDetailViewModel vm = (ItemDetailViewModel)request.getAttribute(ItemDetailViewModel.class.getSimpleName());
	Item item = vm.itemDetail();
	
      out.write("\r\n");
      out.write("\t<img src=\"../img/");
      out.print( item.getProductImg() );
      out.write("\">\r\n");
      out.write("\t<h2>");
      out.print( item.getProductdNm() );
      out.write("</h2>\r\n");
      out.write("\t<b>価格：");
      out.print( item.getUnitPrice() );
      out.write("円</b>\r\n");
      out.write("\t<div style=\"margin:1.0rem 0;\">");
      out.print( item.getDescription() );
      out.write("</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- ここから -->\r\n");
      out.write("\t<div class=\"cart-container\" id=\"cart-container\">\r\n");
      out.write("\t\t<div class=\"shopping-cart\">\r\n");
      out.write("\t\t\t<div style=\"height: 5%; font-weight: bold; font-size: 1.25rem;\">ショッピングカート</div>\r\n");
      out.write("\t\t\t<div style=\"height: 90%; overflow-y: auto;\">\r\n");
      out.write("\t\t\t\t<!-- ここにカートに追加された商品の一覧が表示されます。 -->\r\n");
      out.write("\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t<col width=\"10%\"/>\r\n");
      out.write("\t\t\t\t\t<col width=\"40%\"/>\r\n");
      out.write("\t\t\t\t\t<col width=\"20%\"/>\r\n");
      out.write("\t\t\t\t\t<col width=\"10%\"/>\r\n");
      out.write("\t\t\t\t\t<col width=\"20%\"/>\r\n");
      out.write("\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td>商品コード</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>商品名</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>単価</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>数量</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>購入金額</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t");

					Iterator<Order> iterator = vm.shoppingCart().iterator();
					while (iterator.hasNext()) {
						Order order = iterator.next();
						Item currentItem = order.orderedItem();
					
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.print( currentItem.getProductCd() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.print( currentItem.getProductdNm() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.print( currentItem.getUnitPrice() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.print( order.quantity() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.print( order.purchasePrice() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t");

					}
					
      out.write("\r\n");
      out.write("\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div style=\"height: 5%\">\r\n");
      out.write("\t\t\t\t<button type=\"button\" onclick=\"setVisiblity(false)\">閉じる</button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<form method=\"post\" action=\"addItem\">\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"currentItemCd\" value=\"");
      out.print( item.getProductCd() );
      out.write("\">\r\n");
      out.write("\t\t<button style=\"margin:1.0rem 0;\" type=\"submit\">この商品をカートに追加</button>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t<!-- ここまで -->\r\n");
      out.write("\t<a href=\"items.jsp\">Back</a>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
