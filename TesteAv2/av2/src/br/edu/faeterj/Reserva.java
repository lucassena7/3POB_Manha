	package br.edu.faeterj;
	
	public class Reserva {
	    private int id;
	    private int idQuarto;
	    private int idCama;
	    private String cpfCliente;
	    private String dataEntrada;
	    private String dataSaida;
	    private String numeroCartao;
	    private String dataValidade;
	    private String codigoSeguranca;
	    
		public Reserva(int id, int idQuarto, int idCama, String cpfCliente, String dataEntrada, String dataSaida, String numeroCartao,
				String dataValidade, String codigoSeguranca) {
			this.id= id; 
			this.idQuarto = idQuarto;
			this.idCama = idCama;
			this.cpfCliente = cpfCliente;
			this.dataEntrada = dataEntrada;
			this.dataSaida = dataSaida;
			this.numeroCartao = numeroCartao;
			this.dataValidade = dataValidade;
			this.codigoSeguranca = codigoSeguranca;
			
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
		
		public String getNumeroCartao() {
			return numeroCartao;
		}

		public void setNumeroCartao(String numeroCartao) {
			this.numeroCartao = numeroCartao;
		}

		public String getDataValidade() {
			return dataValidade;
		}

		public void setDataValidade(String dataValidade) {
			this.dataValidade = dataValidade;
		}

		public String getCodigoSeguranca() {
			return codigoSeguranca;
		}

		public void setCodigoSeguranca(String codigoSeguranca) {
			this.codigoSeguranca = codigoSeguranca;
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