
public class LayoutDetailSegmentU {
	private String line;
	
	public LayoutDetailSegmentU(String line) {
		if (line.substring(15, 17).equals("02") && line.substring(13, 14).equals("U")) {
			this.line = line;
		}
	}
	
	public String getDataOcorrencia() {
		return this.line.substring(137, 145);
	}
}