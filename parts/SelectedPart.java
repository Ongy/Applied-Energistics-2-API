package appeng.api.parts;

import net.minecraftforge.common.ForgeDirection;

/**
 * Reports a selected part from th IPartHost
 */
public class SelectedPart
{

	/**
	 * selected part.
	 */
	public final IBusPart part;

	/**
	 * facade part.
	 */
	public final IFacadePart facade;

	/**
	 * side the part is mounted too, or {@link ForgeDirection}.UNKNOWN for cables.
	 */
	public final ForgeDirection side;

	public SelectedPart(IBusPart part, ForgeDirection side) {
		this.part = part;
		facade = null;
		this.side = side;
	}

	public SelectedPart(IFacadePart facade, ForgeDirection side) {
		part = null;
		this.facade = facade;
		this.side = side;
	}

}