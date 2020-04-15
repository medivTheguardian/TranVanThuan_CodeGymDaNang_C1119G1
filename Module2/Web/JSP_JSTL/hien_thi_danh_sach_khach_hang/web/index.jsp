<%--
  Created by IntelliJ IDEA.
  User: tranvanthuan
  Date: 4/12/20
  Time: 10:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <%
    class Customer {
      String name;
      String birthday;
      String address;

      public Customer() {
      }

      public Customer(String name, String birthday, String address) {
        this.name = name;
        this.birthday = birthday;
        this.address = address;
      }

      public String getName() {
        return name;
      }

      public void setName(String name) {
        this.name = name;
      }

      public String getBirthday() {
        return birthday;
      }

      public void setBirthday(String birthday) {
        this.birthday = birthday;
      }

      public String getAddress() {
        return address;
      }

      public void setAddress(String address) {
        this.address = address;
      }
    }

    Customer customer1 = new Customer("Tran Van Thuan", "10/3/1999", "Da Nang");
    Customer customer2 = new Customer("Nguyen Thi Dieu My", "15/5/1992", "Hue");
    Customer customer3 = new Customer("Nguyen Huu Tho", "19/1999", "Quang Tri");
  %>
  <table border="1">
    <tr>
      <th>
        <p>Danh Sach Khach Hang</p>
      </th>
    </tr>
    <tr>
      <th>Ten</th>
      <th>Ngay Sinh</th>
      <th>Dia Chi</th>
    </tr>
    <tr>
      <td><%=customer1.getName()%></td>
      <td><%=customer1.getBirthday()%></td>
      <td><%=customer1.getAddress()%></td>
    </tr>
    <tr>
      <td><%=customer2.getName()%></td>
      <td><%=customer2.getBirthday()%></td>
      <td><%=customer2.getAddress()%></td>
    </tr>
    <tr>
      <td><%=customer3.getName()%></td>
      <td><%=customer3.getBirthday()%></td>
      <td><%=customer3.getAddress()%></td>
    </tr>
  </table>
  </body>
</html>
