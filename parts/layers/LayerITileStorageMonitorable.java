package appeng.api.parts.layers;

import net.minecraftforge.common.ForgeDirection;
import appeng.api.implementations.ITileStorageMonitorable;
import appeng.api.parts.IPart;
import appeng.api.parts.LayerBase;
import appeng.api.storage.IStorageMonitorable;

public class LayerITileStorageMonitorable extends LayerBase implements ITileStorageMonitorable
{

	@Override
	public IStorageMonitorable getMonitorable(ForgeDirection side)
	{
		IPart part = getPart( side );
		if ( part instanceof ITileStorageMonitorable )
			return ((ITileStorageMonitorable) part).getMonitorable( side );
		return null;
	}

}