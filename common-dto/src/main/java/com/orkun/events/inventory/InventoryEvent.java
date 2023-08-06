package com.orkun.events.inventory;

import com.orkun.dto.InventoryDto;
import com.orkun.events.Event;
import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
public class InventoryEvent implements Event {

    private final UUID eventId = UUID.randomUUID();
    private final Date date = new Date();
    private InventoryDto inventory;
    private com.orkun.events.inventory.InventoryStatus status;

    public InventoryEvent() {
    }

    public InventoryEvent(InventoryDto inventory, com.orkun.events.inventory.InventoryStatus status) {
        this.inventory = inventory;
        this.status = status;
    }

    @Override
    public UUID getEventId() {
        return this.eventId;
    }

    @Override
    public Date getDate() {
        return this.date;
    }

    public InventoryDto getInventory() {
        return inventory;
    }

    public com.orkun.events.inventory.InventoryStatus getStatus() {
        return status;
    }

}
