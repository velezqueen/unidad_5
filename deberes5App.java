import javax.swing.JOptionPane;

public class deberes5App {

	public static void main(String[] args) {
		//ejercicio1();
		//ejercicio2();
		//ejercicio3();
		//ejercicio4 ();
		//ejercicio5 ();
		//ejercicio6();
		//ejercicio7();
		//ejercicio8();
		//ejercicio9();
		ejercicio10();
	}

	public static void ejercicio1 () {
		int a = 3, c =8;
		if (a > c) {
			System.out.println (" a es mayor que c");
		} 
		else if (c > a) {
			System.out.println ("c es mayor que a");
			
		} else {
			System.out.println (" son iguales");
		}
	}
	
	public static void ejercicio2 () {
		String nombre = "winiviere";
		System.out.println ("bienvenido  " + nombre);
		
	}
	
	public static void ejercicio3 () {
		String nombre = JOptionPane.showInputDialog("di tu nombre");
		JOptionPane.showMessageDialog(null, "bienvenido  "+ nombre);
	}
	
	public static void ejercicio4 () {
		String numero = JOptionPane.showInputDialog( "calcula el area del circulo");
		double radio = Double.parseDouble (numero);
		double area;
		area = Math.PI * Math.pow (radio,2);
		JOptionPane.showMessageDialog(null, area);
	}
	
	public static void ejercicio5 () {
		String numero = JOptionPane.showInputDialog ("introduce numero");
		int num = Integer.parseInt (numero);
		if (num %2 == 0) {
			JOptionPane.showMessageDialog (null, "es divisible entre 2");
			
		} else JOptionPane.showMessageDialog (null,"no es divisible");
	}
	public static void ejercicio6 () {
		String precio = JOptionPane.showInputDialog ("diga el precio del producto");
		double precioiv = Double.parseDouble(precio),preciof ;
		final double IVA = 0.21;
		preciof = precioiv * IVA ;
				JOptionPane.showMessageDialog(null, preciof);
	}
	
	public static void ejercicio7 () {
		int  i = 1;
		
		while ( i <= 100) {
			System.out.println (i);
			i++;
		}
	}
	
	public static void ejercicio8 () {
	
		for (int i =1; i <=100; i++ ) {
			System.out.println (i);
		}
	}
	
	
	public static void ejercicio9 () {
		
		for (int i =1; i <=100; i++ ) {
			if (i %2 ==0 && i %3 ==0) {
			System.out.println (i);
		}
	}
	
	}
	
	public static void ejercicio10 () {
		String texto = JOptionPane.showInputDialog("di el numero de ventas");
		int i, ventas = Integer.parseInt(texto);
		double preciofinal = 0, precio;
		
		for (i = 0; i < ventas; i++) {
			texto = JOptionPane.showInputDialog("Di el precio");
            precio = Integer.parseInt(texto);
            preciofinal += precio;
        }

        JOptionPane.showMessageDialog(null, "El precio final es " + preciofinal);
		}
	
	 
}

