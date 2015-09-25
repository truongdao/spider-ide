package spider.ide.modern.iostream;

import javax.swing.JTextPane;

public class IdeErrorStream extends IdeStream{

	public IdeErrorStream(JTextPane ta) {
		super(ta);
	}

	@Override
	protected void write(String s) {
		// TODO add ERROR delimiter (html style with color)
		super.write(s);
	}

	
}
