package spider.ide.modern.iostream;

import javax.swing.JTextPane;

public class IdeOutputStream extends IdeStream{

	public IdeOutputStream(JTextPane ta) {
		super(ta);
	}

	@Override
	protected void write(String s) {
		// TODO add OUTPUT delemeter (html style with color)
		super.write(s);
	}
	
}
