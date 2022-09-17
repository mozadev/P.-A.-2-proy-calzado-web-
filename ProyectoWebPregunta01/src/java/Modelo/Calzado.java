
package Modelo;

public class Calzado
{
    	String Marca ;
	int talla;
	int   costoparcalzado;
	int numeroparesvendidos;
	double descuento;
	double   igv;
	double ventaneta; 

    public  String CalcularCalzado (String marca , int  talla ,int numeroparesvendidos ) 
    {        
        double precio=0;
        if (talla==30 && "Batta".equals(marca))
        {
            precio=130;
        }
         if (talla==30 && "Calimod".equals(marca))
        {
            precio=122;
        }
          if (talla==30 && "Azaleia".equals(marca))
        {
            precio=120;
        }
           if (talla==30 && "Renzo costa".equals(marca))
        {
            precio=155;
        }
           //talla 35
           
            if (talla==35 && "Batta".equals(marca))
        {
            precio=132;
        }
         if (talla==35 && "Calimod".equals(marca))
        {
            precio=125;
        }
          if (talla==35 && "Azaleia".equals(marca))
        {
            precio=125;
        }
           if (talla==35 && "Renzo costa".equals(marca))
        {
            precio=160;
        }
           //talla 39
           
            if (talla==39 && "Batta".equals(marca))
        {
            precio=144;
        }
         if (talla==39 && "Calimod".equals(marca))
        {
            precio=127;
        }
          if (talla==39 && "Azaleia".equals(marca))
        {
            precio=130;
        }
           if (talla==39 && "Renzo costa".equals(marca))
        {
            precio=167;
        }
           
           //talla 40
           
            if (talla==40 && "Batta".equals(marca))
        {
            precio=150;
        }
         if (talla==40 && "Calimod".equals(marca))
        {
            precio=130;
        }
          if (talla==40 && "Azaleia".equals(marca))
        {
            precio=137;
        }
           if (talla==40 && "Renzo costa".equals(marca))
        {
            precio=170;
        }
           //talla 44
           
            if (talla==44 && "Batta".equals(marca))
        {
            precio=155;
        }
         if (talla==44 && "Calimod".equals(marca))
        {
            precio=144;
        }
          if (talla==44 && "Azaleia".equals(marca))
        {
            precio=144;
        }
           if (talla==44 && "Renzo costa".equals(marca))
        {
            precio=177;
        }
           double venta=precio*numeroparesvendidos;
           double descuento=0;
           
           if (2<=numeroparesvendidos && numeroparesvendidos<=5)
        {
            descuento=0.05*venta;
        }
               if (6<=numeroparesvendidos && numeroparesvendidos<=10)
        {
            descuento=0.08*venta;
        }
           
            if (11<=numeroparesvendidos && numeroparesvendidos<=20)
        {
            descuento=0.1*venta;
        }
           
          if (21<=numeroparesvendidos && numeroparesvendidos<=30)
        {
            descuento=0.15*venta;
        }
           
          double ventaBruta=venta-descuento;
          double igv=ventaBruta*0.18;
          double ventaNeta=ventaBruta+igv;
           
          String ventaFINALcADEN=String.valueOf(ventaNeta);
        return  ventaFINALcADEN;
        
    }
    
    
}
