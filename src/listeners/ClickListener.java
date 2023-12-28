package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import main.data;
import main.ui;

public class ClickListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        int result=data.get();
        ui.b.setText(String.valueOf(result));
        ui.t2.setText("");
        ui.t1.setText("");
        data.i1=0;
        data.i2=0;
    }
}
