package com.util.diegusweb.querepasarhoy.db;

import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.ForeignKey;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;

@Table(database = MyPanelDb.class)
public class TitleList extends BaseModel {
    @Column
    @PrimaryKey
    int id;

    @Column
    String name;

    @Column
    @ForeignKey(saveForeignKeyModel = false)
    Panel panel;

    public void setOrganization(Panel panel) {
        this.panel = panel;
    }

    public void setName(String name) {
        this.name = name;
    }
}
