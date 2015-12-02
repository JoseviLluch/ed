using System;
using Gtk;

public partial class MainWindow: Gtk.Window
{	
	public MainWindow (): base (Gtk.WindowType.Toplevel)
	{
		Build ();
		Table table = new Table (9, 10, true);
		List<int> numeros = new ListStore<Button> ();
		List<Button> buttons = new List<Buttons> ();


		for (uint index=0; index<90; index++) {


			Button button = new Button ();

			button.Visible = true;
			uint row = index / 10;
			uint column = index % 10;
			int numero = index + 1;
			button.Label = numero.ToString ();
			button.Visible = true;
			table.Attach (button, column, column+1, row, row +1);
			button.Add (button);
			button.Add (numero);
		}
		table.Visible = true;
		vbox1.Add (button);

		buttonNumero.Clicked += delegate {
			int indexAleatorio = random.Next (numeros.Count);
			int numero = numeros [indexAleatorio];
			numeros.RemoveAt (indexAleatorio);
			LabelNumero.Text = numero.ToString ();

			Button button = buttons(numero -1);
			button.ModifyBg (StateType.Normal, GREEN_COLOR);
			ProcessEvent.Start ("espeak", "-v es "+numero);
			buttonNumero.Sensitive=numeros.Count>0;
		}
		;}
	protected void OnDeleteEvent (object sender, DeleteEventArgs a)
	
}
