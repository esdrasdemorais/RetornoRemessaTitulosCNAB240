import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Register {
	private String loteServico;
	private String numeroSequencialRegistroLote;
	private String codigoMovimentoRetorno;
	private String agenciaMantenedoraConta;
	private String digitoVerificadorAgencia;
	private String numeroContaCorrente;
	private String digitoVerificadorConta;
	private String identificacaoTitulo;
	private String codigoCarteira;
	private String numeroDocumentoCobranca;
	private Date dataVencimentoTitulo;
	private float valorNominalTitulo;
	private String numeroBanco;
	private String agenciaCobradora;
	private String digitoVerificadorAgenciaCobradora;
	private String identificacaoMovimentoRetorno;
	private Date dataOcorrencia;
	public String getLoteServico() {
		return loteServico;
	}
	public void setLoteServico(String loteServico) {
		this.loteServico = loteServico;
	}
	public String getNumeroSequencialRegistroLote() {
		return numeroSequencialRegistroLote;
	}
	public void setNumeroSequencialRegistroLote(String numeroSequencialRegistroLote) {
		this.numeroSequencialRegistroLote = numeroSequencialRegistroLote;
	}
	public String getCodigoMovimentoRetorno() {
		return codigoMovimentoRetorno;
	}
	public void setCodigoMovimentoRetorno(String codigoMovimentoRetorno) {
		this.codigoMovimentoRetorno = codigoMovimentoRetorno;
	}
	public String getAgenciaMantenedoraConta() {
		return agenciaMantenedoraConta;
	}
	public void setAgenciaMantenedoraConta(String agenciaMantenedoraConta) {
		this.agenciaMantenedoraConta = agenciaMantenedoraConta;
	}
	public String getDigitoVerificadorAgencia() {
		return digitoVerificadorAgencia;
	}
	public void setDigitoVerificadorAgencia(String digitoVerificadorAgencia) {
		this.digitoVerificadorAgencia = digitoVerificadorAgencia;
	}
	public String getNumeroContaCorrente() {
		return numeroContaCorrente;
	}
	public void setNumeroContaCorrente(String numeroContaCorrente) {
		this.numeroContaCorrente = numeroContaCorrente;
	}
	public String getDigitoVerificadorConta() {
		return digitoVerificadorConta;
	}
	public void setDigitoVerificadorConta(String digitoVerificadorConta) {
		this.digitoVerificadorConta = digitoVerificadorConta;
	}
	public String getIdentificacaoTitulo() {
		return identificacaoTitulo;
	}
	public void setIdentificacaoTitulo(String identificacaoTitulo) {
		this.identificacaoTitulo = identificacaoTitulo.replaceAll("\\s+", "");
	}
	public String getCodigoCarteira() {
		return codigoCarteira;
	}
	public void setCodigoCarteira(String codigoCarteira) {
		this.codigoCarteira = codigoCarteira;
	}
	public String getNumeroDocumentoCobranca() {
		return numeroDocumentoCobranca;
	}
	public void setNumeroDocumentoCobranca(String numeroDocumentoCobranca) {
		this.numeroDocumentoCobranca = numeroDocumentoCobranca;
	}
	public Date getDataVencimentoTitulo() {
		//SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		//System.out.println(sdf.format(this.dataVencimentoTitulo));
		return this.dataVencimentoTitulo;
	}
	public void setDataVencimentoTitulo(String dataVencimentoTitulo) {
		try {
			this.dataVencimentoTitulo = new SimpleDateFormat("ddMMyyyy").parse(dataVencimentoTitulo);
		} catch (ParseException pex) {
			System.out.println(pex.getMessage());
		}
	}
	public float getValorNominalTitulo() {
		return valorNominalTitulo;
	}
	public void setValorNominalTitulo(String valorNominalTitulo) {
		valorNominalTitulo = valorNominalTitulo.substring(0, 13) + "." + 
			valorNominalTitulo.substring(13, valorNominalTitulo.length()); 
		this.valorNominalTitulo = Float.parseFloat(valorNominalTitulo);
	}
	public String getNumeroBanco() {
		return numeroBanco;
	}
	public void setNumeroBanco(String numeroBanco) {
		this.numeroBanco = numeroBanco;
	}
	public String getAgenciaCobradora() {
		return agenciaCobradora;
	}
	public void setAgenciaCobradora(String agenciaCobradora) {
		this.agenciaCobradora = agenciaCobradora;
	}
	public String getDigitoVerificadorAgenciaCobradora() {
		return digitoVerificadorAgenciaCobradora;
	}
	public void setDigitoVerificadorAgenciaCobradora(String digitoVerificadorAgenciaCobradora) {
		this.digitoVerificadorAgenciaCobradora = digitoVerificadorAgenciaCobradora;
	}
	public String getIdentificacaoMovimentoRetorno() {
		return identificacaoMovimentoRetorno;
	}
	public void setIdentificacaoMovimentoRetorno(String identificacaoMovimentoRetorno) {
		this.identificacaoMovimentoRetorno = identificacaoMovimentoRetorno;
	}
	public Date getDataOcorrencia() {
		//SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		//System.out.println(sdf.format(this.dataOcorrencia));
		return this.dataOcorrencia;
	}
	public void setDataOcorrencia(String dataOcorrencia) {
		try {
			this.dataOcorrencia = new SimpleDateFormat("ddMMyyyy").parse(dataOcorrencia);
		} catch (ParseException pex) {
			System.out.println(pex.getMessage());
		}
	}
}