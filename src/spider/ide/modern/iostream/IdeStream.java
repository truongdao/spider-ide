package spider.ide.modern.iostream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Locale;

import javax.swing.JTextPane;

public class IdeStream extends PrintStream{

	private JTextPane console;


	public IdeStream(File arg0) throws FileNotFoundException {
		super(arg0);
	}

	/*****************************************************************************/
	/*    S P I D E R   C O D E                                                  */
	/*****************************************************************************/

	public IdeStream(JTextPane console) {
		super(new OutputStream(){
			public void write(int arg0) throws IOException {}	
		});
		this.console = console;
	}

	/**
	 * All functions refer to this function
	 * 
	 * @param s
	 */
	protected void write(String s) {
		try {
			synchronized (this) {
				console.setText(console.getText() + s);
			}
		} catch (Exception x) {
		}
	}
	
	/*****************************************************************************/
	/*****************************************************************************/

	@Override
	public PrintStream append(char arg0) {
		// TODO Auto-generated method stub
		return super.append(arg0);
	}

	@Override
	public PrintStream append(CharSequence arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub
		return super.append(arg0, arg1, arg2);
	}

	@Override
	public PrintStream append(CharSequence arg0) {
		// TODO Auto-generated method stub
		return super.append(arg0);
	}

	@Override
	public boolean checkError() {
		return false;

	}

	@Override
	protected void clearError() {
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		//super.close();
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		//super.flush();
	}

	@Override
	public PrintStream format(Locale arg0, String arg1, Object... arg2) {
		// TODO Auto-generated method stub
		return super.format(arg0, arg1, arg2);
	}

	@Override
	public PrintStream format(String arg0, Object... arg1) {
		// TODO Auto-generated method stub
		return super.format(arg0, arg1);
	}

	
	private void newLine(){
		write("\n");
	}
	
	@Override
    public void print(boolean b) {
        write(b ? "true" : "false");
    }

	@Override
    public void print(char c) {
        write(String.valueOf(c));
    }


	@Override
    public void println(double x) {
        synchronized (this) {
            print(x);
            newLine();
        }
    }

    public void println(float x) {
        synchronized (this) {
            print(x);
            newLine();
        }
    }

    @Override
    public void print(int i) {
        write(String.valueOf(i));
    }
    
	@Override
    public void print(long l) {
        write(String.valueOf(l));
    }

	@Override
    public void print(Object obj) {
        write(String.valueOf(obj));
    }

	@Override
    public void print(String s) {
        if (s == null) {
            s = "null";
        }
        write(s);
    }

	@Override
	public PrintStream printf(Locale arg0, String arg1, Object... arg2) {
		// TODO Auto-generated method stub
		return super.printf(arg0, arg1, arg2);
	}

	@Override
	public PrintStream printf(String arg0, Object... arg1) {
		// TODO Auto-generated method stub
		return super.printf(arg0, arg1);
	}

	@Override
    public void println() {
        newLine();
    }

	@Override
    public void println(boolean x) {
        synchronized (this) {
            print(x);
            newLine();
        }
    }

	@Override
    public void println(char x) {
        synchronized (this) {
            print(x);
            newLine();
        }
    }

	@Override
    public void println(char x[]) {
        synchronized (this) {
            print(x);
            newLine();
        }
    }


	@Override
    public void println(int x) {
        synchronized (this) {
            print(x);
            newLine();
        }
    }

	@Override
    public void println(long x) {
        synchronized (this) {
            print(x);
            newLine();
        }
    }

	@Override
    public void println(Object x) {
        String s = String.valueOf(x);
        synchronized (this) {
            print(s);
            newLine();
        }
    }

	@Override
    public void println(String x) {
        synchronized (this) {
            print(x);
            newLine();
        }
    }

	@Override
	protected void setError() {

	}

	@Override
	public void write(byte[] arg0, int arg1, int arg2) {

	}

	@Override
	public void write(int arg0) {

	}
	
	
}
