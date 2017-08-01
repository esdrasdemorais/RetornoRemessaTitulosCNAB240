import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Layout {
	private RegisterConnection rc;
	private LayoutDetailSegmentT layoutDetailSegmentT;
	 
	public Layout(String filePath) throws IOException {
		this.rc = new RegisterConnection();
			
		FileInputStream fis = new FileInputStream(filePath);
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		String headerFileLine = br.readLine();
		String headerLoteLine = br.readLine();
		String line;
		
		while((line = br.readLine()) != null) {
			String lineSegmentU = br.readLine(); 
			this.layoutDetailSegmentT = new LayoutDetailSegmentT(line, lineSegmentU);
			if (this.layoutDetailSegmentT.getTitulo() instanceof Register) {
				this.save();
			}
		}
		
		this.rc.close();
	}
	
	private void save() {
		this.rc.saveRegister(this.layoutDetailSegmentT.getTitulo());
	}
}