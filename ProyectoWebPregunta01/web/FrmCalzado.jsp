<%-- 
    Document   : FrmCalzado
    Created on : 16 oct. 2021, 16:20:31
    Author     : PROPIETARIO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <script>
              function   Calcular()
              {
                  document.form.action="<%=request.getContextPath()%>/CalzadoControlador"; // destino  hacia  otra  pagina 
                  document.form.method="GET"; //  tipo redireccionamiento 
                  document.form.submit(); // es  un metodo para enviar los  parametros
              }
        </script>   
        
        
    </head>
    <body>
        
       <center>
        <form name="form">
            <table style="width: 400px;height: 100px ;background-color: yellow">
                <tr>
                    <td>Marca :</td>
                    <td><select name="txtMarca" >
                            <option value="0" selected="">..............</option>
                            <option value="Batta">Batta</option>
                            <option value="Calimod">Calimod</option>
                            <option value="Azaleia">Azaleia</option>
                            <option value="Renzo costa">Renzo costa</option>
                           
                            
                        </select></td>
                </tr>  
                <tr>
                    <td>Talla :</td>
                    <td><input type="text"  name="txtTalla"    /></td>
                </tr> 
                
             
                 <tr>
                    <td>Numero de pares vendidos :</td>
                    <td><input type="text"  name="txtNumeroParesVend" /></td>
                </tr> 
                
                
                
                <tr >
                    <td  colspan="2">
                          <center>
                              <input type="button" name="bntCalcular" value="Calcular"  onclick="Calcular()"/>
                          </center>                     
                    </td>
                </tr>
                
                  <tr>
                    <td>precio final :</td>
                    <td><input type="text"  name="txtPrecioFINAL"    <%     // fraccion de codigo java
              if(request.getAttribute("precioFINAL")!=null)// capturo el parametro de nombre mensaje
              { %>
               
                value="<%=(String)request.getAttribute("precioFINAL")%>" 
              <%}            
            %>   /></td>
                </tr> 
                
            </table>
        </form>
    </center>
    </body>
</html>
