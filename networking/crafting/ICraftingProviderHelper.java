package appeng.api.networking.crafting;

/**
 * Passed to a ICraftingProvider as a interface to manipulate the available crafting jobs.
 */
public interface ICraftingProviderHelper
{

	/**
	 * Add new Pattern to AE's crafting cache.
	 */
	void addCraftingOption(ICraftingMedium medium, ICraftingPatternDetails api);

}
