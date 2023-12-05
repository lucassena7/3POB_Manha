	package br.edu.faeterj;
	
	public class Reserva {
	    private int id;
	    private int idQuarto;
	    private int idCama;
	    private String cpfCliente;
	    private String dataEntrada;
	    private String dataSaida;
	    
		public Reserva(int id, int idQuarto, String cpfCliente, String dataEntrada, String dataSaida) {
			this.id= id; 
			this.idQuarto = idQuarto;
			this.cpfCliente = cpfCliente;
			this.dataEntrada = dataEntrada;
			this.dataSaida = dataSaida;
		}
		
		public int getId() {
			return id;
		}
		
		public void setId(int id) {
			this.id = id;
		}
		
		public int getIdQuarto() {
			return idQuarto;
		}
		
		public void setIdQuarto(int idQuarto) {
			this.idQuarto = idQuarto;
		}
		
		public int getIdCama() {
			return idCama;
		}
		
		public void setIdCama(int idCama) {
			this.idCama = idCama;
		}
		
		public String getCpfCliente() {
			return cpfCliente;
		}
		
		public void setCpfCliente(String cpfCliente) {
			this.cpfCliente = cpfCliente;
		}
		
		public String getDataEntrada() {
			return dataEntrada;
		}
		
		public void setDataEntrada(String dataEntrada) {
			this.dataEntrada = dataEntrada;
		}
		
		public String getDataSaida() {
			return dataSaida;
		}
		
		public void setDataSaida(String dataSaida) {
			this.dataSaida = dataSaida;
		}
		
		public String toString() {
			 return "\nId " + id +
					 "\nId do Quarto: " + idQuarto + 
					 "\nId da Cama: " + idCama + 
		            "\ncpf do Cliente: " + cpfCliente +
		            "\nData de Entrada: " + dataEntrada +
			 		"\nData de Saida: " + dataSaida + "\n";
		    }
	}