
public class LayoutDetailSegmentT {
	private Register titulo;
	private LayoutDetailSegmentU segmentU;
	
	public LayoutDetailSegmentT(String line, String lineSegmentU) {
		//Código de Movimento Retorno - Entrada confirmada
		if (line.substring(15, 17).equals("02") && line.substring(13, 14).equals("T")) {
			this.titulo = new Register();
			
			this.titulo.setLoteServico(this.getLoteServico(line));
			this.titulo.setNumeroSequencialRegistroLote(
				this.getNumeroSequencialRegistroLote(line)
			);
			this.titulo.setCodigoMovimentoRetorno(this.getCodigoMovimentoRetorno(line));
			this.titulo.setAgenciaMantenedoraConta(
				this.getAgenciaMantenedoraConta(line)
			);
			this.titulo.setDigitoVerificadorAgencia(this.getDigitoVerificadorAgencia(line));
			this.titulo.setNumeroContaCorrente(this.getNumeroContaCorrente(line));
			this.titulo.setDigitoVerificadorConta(this.getDigitoVerificadorConta(line));
			this.titulo.setIdentificacaoTitulo(this.getIdentificacaoTitulo(line));
			this.titulo.setCodigoCarteira(this.getCodigoCarteira(line));
			this.titulo.setNumeroDocumentoCobranca(this.getNumeroDocumentoCobranca(line));
			this.titulo.setDataVencimentoTitulo(this.getDataVencimentoTitulo(line));
			this.titulo.setValorNominalTitulo(this.getValorNominalTitulo(line));
			this.titulo.setNumeroBanco(this.getNumeroBanco(line));
			this.titulo.setAgenciaCobradora(this.getAgenciaCobradora(line));
			this.titulo.setDigitoVerificadorAgenciaCobradora(this.getDigitoVerificadorAgenciaCobradora(line));
			this.titulo.setIdentificacaoMovimentoRetorno(this.getIdentificacaoMovimentoRetorno(line));
			
			this.segmentU = new LayoutDetailSegmentU(lineSegmentU);
			this.titulo.setDataOcorrencia(this.segmentU.getDataOcorrencia());
		}
	}
	
	public Register getTitulo() {
		return this.titulo;
	}
		
	private String getLoteServico(String line) {
		return line.substring(3, 7); //Lote
	}
	
	private String getNumeroSequencialRegistroLote(String line) {
		return line.substring(8, 13); //Nº Sequencial do Registro no Lote
	}
	
	private String getCodigoMovimentoRetorno(String line) {
		return line.substring(15, 17);
	}
	
	private String getAgenciaMantenedoraConta(String line) {
		return line.substring(17, 22); // "04770"; //Agência Mantenedora da Conta
	}
	
	private String getDigitoVerificadorAgencia(String line) {
		return line.substring(22, 23); //"8"; //Dígito Verificador da Agência
	}
	
	private String getNumeroContaCorrente(String line) { 
		return line.substring(23, 35); //"000000022000"; //Número da Conta Corrente
	}
	
	private String getDigitoVerificadorConta(String line) {
		return line.substring(35, 36); //"0"; //Dígito Verificador da Conta
	}
	
	private String getIdentificacaoTitulo(String line) {
		return line.substring(37, 57); //Identificação do Título no Banco
	}
	
	private String getCodigoCarteira(String line) {
		return line.substring(57, 58); //"7"; //Código da Carteira
	}
	
	private String getNumeroDocumentoCobranca(String line) {
		return line.substring(58, 73);
	}
	
	private String getDataVencimentoTitulo(String line) {
		return line.substring(73, 81); //Data de Vencimento do Título
	}
	
	private String getValorNominalTitulo(String line) {
		return line.substring(81, 96);
	}
	
	private String getNumeroBanco(String line) {
		return line.substring(96, 99);
	}
	
	private String getAgenciaCobradora(String line) {
		return line.substring(99, 104); //Agência Encarregada da Cobrança
	}
	
	private String getDigitoVerificadorAgenciaCobradora(String line) {
		return line.substring(104, 105); //Dígito Verificador da Agência
	}
	
	private String getIdentificacaoMovimentoRetorno(String line) {
		return line.substring(213, 223);
	}
}
	
