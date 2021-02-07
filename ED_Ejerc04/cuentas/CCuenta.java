//* @author Sergio Manuel Sanchez Serrano*/
// @version IDeeae9f5 1.0
//@since 07/02/2021


public class CCuenta {

/**Creacion de atributos o variables */
	
	    private String nombre;
	    private String cuenta;
	    private double saldo;
	    private double tipoInterés;

	    /**@param double gettipointeres
	     * @return tipo de interes
	    */
	    double getTipoInterés() {
			return tipoInterés;
		}
	    
	    /**@param double settipointeres
	     * @return this de tipo de interes
	      */
		void setTipoInterés(double tipoInterés) {
			this.tipoInterés = tipoInterés;
		}
		
		/** @param getsaldo
		 * @return saldo
		 * */
		double getSaldo() {
			return saldo;
		}
		
		/**@param setsaldo
		 * @return this de saldo 
		 * */
		void setSaldo(double saldo) {
			this.saldo = saldo;
		}
		
		/**@param string getcuenta
		 * @return cuenta 
		 * */
		
		String getCuenta() {
			return cuenta;
		}

		/**@param setcuenta
		 * @return this de cuenta 
		 * */
		void setCuenta(String cuenta) {
			this.cuenta = cuenta;
		}

		/**@param string getnombre
		 * @return nombre 
		 * */
		String getNombre() {
			return nombre;
		}
		
		/**@param set nombre 
		 * @return this de nombre 
		 * */
		void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
		//Creacion de metodo
		
		public CCuenta()
	    {
	    }
		
		
		/**Creacion de metodo ccuenta con string y double
		 * @param setnombre
		 * @param setcuenta
		 * @param setsaldo
		 * */
	
	    public CCuenta(String nom, String cue, double sal, double tipo)
	    {
	        setNombre(nom);
	        setCuenta(cue);
	        setSaldo(sal);
	    }
	    
	    /**Creacion de metodo estado
	     * @param estado
	     * @return getsaldo
	     * */
	    
	    public double estado()
	    {
	        return getSaldo();
	    }

	    /** Metodo ingresar con un condicional if con excepcion para definir que no se puede ingresar la cantidad
	     * negativa
	     * @param catidad a ingresar
	     * @return  mensaje de excepcion de no se puede ingresar una cantidad negativa
	     * */
	    public void ingresar(double cantidad) throws Exception
	    {
	        if (cantidad<0)
	            throw new Exception("No se puede ingresar una cantidad negativa");
	        setSaldo(getSaldo() + cantidad);
	    }
	    
	    
	    /** Metodo retirar con dos condicionales if con dos excepciones para definir que no se puede
	     * retirar una cantidad negativa y que no hay suficiente saldo
	     * @param cantidad a retirar
	     * @return mensaje de excepcion primero en el cual no se puede retirar una cantidad negativa
	     * @return mensade de excepcion segundo que no hay suficiente saldo para retirar
	     */
	    public void retirar(double cantidad) throws Exception
	    {
	        if (cantidad <= 0)
	            throw new Exception ("No se puede retirar una cantidad negativa");
	        if (estado()< cantidad)
	            throw new Exception ("No se hay suficiente saldo");
	        setSaldo(getSaldo() - cantidad);
	    }
	}


