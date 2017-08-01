import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class RegisterConnection {
	private Connection con;
	private Statement stm;
	
	public RegisterConnection() {
		try {
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
	    	this.con = DriverManager.getConnection("jdbc:ucanaccess://\\\\proaxdtb\\sig\\CNAB240CobrancaTitulos.mdb");
	        this.stm = con.createStatement();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	public boolean saveRegister(Register reg) {
		String query = "INSERT INTO CNAB240_RETORNO_REGISTRO_TITULOS (loteServico, numeroSequencialRegistroLote, codigoMovimentoRetorno, agenciaMantenedoraConta, digitoVerificadorAgencia, "
				+ "numeroContaCorrente, digitoVerificadorConta, identificacaoTitulo, codigoCarteira, numeroDocumentoCobranca, dataVencimentoTitulo, valorNominalTitulo, numeroBanco, agenciaCobradora, "
				+ "digitoVerificadorAgenciaCobradora, identificacaoMovimentoRetorno, dataOcorrencia)"
				+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		try {
			PreparedStatement pst = this.con.prepareStatement(query);
			pst.setString(1, reg.getLoteServico());
			pst.setString(2, reg.getNumeroSequencialRegistroLote());
			pst.setString(3, reg.getCodigoMovimentoRetorno());
			pst.setString(4, reg.getAgenciaMantenedoraConta());
			pst.setString(5, reg.getDigitoVerificadorAgencia());
			pst.setString(6, reg.getNumeroContaCorrente());
			pst.setString(7, reg.getDigitoVerificadorConta());
			pst.setString(8, reg.getIdentificacaoTitulo());
			pst.setString(9, reg.getCodigoCarteira());
			pst.setString(10, reg.getNumeroDocumentoCobranca());
			pst.setDate(11, new java.sql.Date(reg.getDataVencimentoTitulo().getTime()));
			pst.setFloat(12, reg.getValorNominalTitulo());
			pst.setString(13, reg.getNumeroBanco());
			pst.setString(14, reg.getAgenciaCobradora());
			pst.setString(15, reg.getDigitoVerificadorAgenciaCobradora());
			pst.setString(16, reg.getIdentificacaoMovimentoRetorno());
			pst.setDate(17, new java.sql.Date(reg.getDataOcorrencia().getTime()));
			
			pst.executeUpdate();
			pst.close();
		} catch(SQLException sqle) {
			System.out.println(sqle.getMessage());
		}
		
		return true;
	}
	
	public void close() {
		try {
			this.con.close();
		} catch (SQLException sqlex) {
			System.out.println(sqlex);
		}
	}
}