package com.util.diegusweb.querepasarhoy.model;

import com.util.diegusweb.querepasarhoy.R;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Panel {

    private String title;
    private boolean status;
    private Date creation;
    private int idDrawable;

    public Panel(String title, boolean status, Date creation, int idDrawable) {
        this.title = title;
        this.status = status;
        this.creation = creation;
        this.idDrawable = idDrawable;
    }

    public String getTitle() {
        return title;
    }

    public boolean isStatus() {
        return status;
    }

    public Date getCreation() {
        return creation;
    }

    public int getIdDrawable() {
        return idDrawable;
    }

    public static final List<Panel> PANEL_LIST = new ArrayList<Panel>();


    static {
        PANEL_LIST.add(new Panel("PanelDemo", true, new Date(), R.drawable.camarones));
        PANEL_LIST.add(new Panel("PanelDemo de", true, new Date(), R.drawable.coctel));
        PANEL_LIST.add(new Panel("PanelDemo sds", false, new Date(), R.drawable.cafe));
    }
}
