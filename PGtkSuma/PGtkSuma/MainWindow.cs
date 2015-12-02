using System;
using Gtk;

public partial class MainWindow: Gtk.Window
{	
	public MainWindow (): base (Gtk.WindowType.Toplevel)
	{
		Build ();
	}

	protected void OnDeleteEvent (object sender, DeleteEventArgs a)
	{
		Application.Quit ();
		a.RetVal = true;
	}

	protected void OnButton2Clicked (object sender, EventArgs e)
	{
		decimal numero1 = decimal.Parse(entry1.Text);
		decimal numero2 = decimal.Parse (entry2.Text);
		decimal resultado = numero1 + numero2;
		this.Resultado.Text = resultado.ToString ();

	}
}
