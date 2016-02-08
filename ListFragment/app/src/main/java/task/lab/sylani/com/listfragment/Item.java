package task.lab.sylani.com.listfragment;

/*
 * Created by Moosa on 7/12/2015.
 */
public class Item {
    private boolean checked;
    private String text;

    public Item(boolean checked, String text) {
        this.checked = checked;
        this.text = text;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
