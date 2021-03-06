package org.bukkit.event.painting;

import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Painting;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;

/**
 * Triggered when a painting is created in the world
 */
public class PaintingPlaceEvent extends PaintingEvent implements Cancellable {

    private boolean cancelled;

    private Player player;
    private Block block;
    private BlockFace blockFace;

    public PaintingPlaceEvent(final Painting painting, final Player player, Block block, BlockFace blockFace) {
        super(Event.Type.PAINTING_PLACE, painting);
        this.player = player;
        this.block = block;
        this.blockFace = blockFace;
    }

    /**
     * Returns the player placing the painting
     *
     * @return Entity returns the player placing the painting
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * Returns the block that the painting was placed on
     *
     * @return Block returns the block painting placed on
     */
    public Block getBlock() {
        return block;
    }

    /**
     * Returns the face of the block that the painting was placed on
     *
     * @return BlockFace returns the face of the block the painting was placed on
     */
    public BlockFace getBlockFace() {
        return blockFace;
    }

    /**
     * Gets the cancellation state of this event. A cancelled event will not
     * be executed in the server, but will still pass to other plugins
     *
     * @return true if this event is cancelled
     */
    public boolean isCancelled() {
        return cancelled;
    }

    /**
     * Sets the cancellation state of this event. A cancelled event will not
     * be executed in the server, but will still pass to other plugins
     *
     * @param cancel true if you wish to cancel this event
     */
    public void setCancelled(boolean cancel) {
        this.cancelled = cancel;
    }
}
