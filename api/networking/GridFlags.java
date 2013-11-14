package appeng.api.networking;

/**
 * Various flags to determine network node behavior.
 */
public enum GridFlags
{
	/**
	 * import/export buses, terminals, and other devices that use network
	 * features, will use this setting.
	 */
	REQURE_CHANNEL,

	/**
	 * MAC, and P2P ME tunnels use this setting.
	 */
	DENSE_CHANNEL
}
