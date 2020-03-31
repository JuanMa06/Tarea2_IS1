
public class FuncionesUsuario {

	// Calculo el impuesto a pagar
	public double calcularImpuestos(Usuario usuario) {
		// Si es menor no paga impuestos
		if (usuario.getEdad() < 18) return 0;
		
		double impuesto = 0;
		
		// Calculo el impuesto segun la edad
		if (usuario.getEdad() <= 30) 
			impuesto = 2000;
		else if (usuario.getEdad() <= 65) 
			impuesto = 7000;
		else impuesto = 2000;
		
		// Le descuento segun la cantidad de hijos
		int descuento = usuario.getCantidadHijos() * 3;
		if (descuento >= 50) descuento = 50;
		
		return impuesto * (1 - (descuento / 100));
	}
	
	
	// Agrega el sueldo pagado a su saldo
	public void cobrarSueldo(Usuario usuario, double sueldo) {
		usuario.setSaldo(usuario.getSaldo() + sueldo);
	}
	
}
