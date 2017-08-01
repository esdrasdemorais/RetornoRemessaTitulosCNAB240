import java.io.IOException;

public class LayoutSave {

	private static String pathFile = "\\\\fileserver\\proguaru\\docs_gf\\Contas a Receber\\BBRetorno\\RetornoImportados\\";
	
	public static void main(String[] args) {
		Layout layout;
		try {
			layout = new Layout(LayoutSave.pathFile + args[0]);
		} catch (IOException eoex) {
			System.out.println(eoex.getMessage());
		} finally {
			layout = null;
		}
	}

}
