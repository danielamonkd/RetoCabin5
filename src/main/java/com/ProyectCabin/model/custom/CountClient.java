package com.ProyectCabin.model.custom;

import com.ProyectCabin.model.ClientModel;

public class CountClient {
    private Long total;
    private ClientModel client;

    public CountClient(Long total, ClientModel client) {
        this.total = total;
        this.client = client;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public ClientModel getClient() {
        return client;
    }

    public void setClient(ClientModel client) {
        this.client = client;
    }
}
