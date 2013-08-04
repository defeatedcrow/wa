package wa;

import net.minecraft.block.Block;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Items {

	public static EnumToolMaterial tamahagane = EnumHelper.addToolMaterial("tamahagane", 2, 157, 6.0F, 3, 18);
	public static Item 刀 = new ItemSword(Config.刀ID, tamahagane).setUnlocalizedName("wa:katana").func_111206_d("wa:katana").setCreativeTab(Wa.creativeTab);
	public static Item 太刀 = new ItemTachi(Config.太刀ID, tamahagane).setUnlocalizedName("wa:tachi").func_111206_d("wa:tachi").setCreativeTab(Wa.creativeTab);
	public static Item 玉鋼 = new Item(Config.玉鋼ID).setUnlocalizedName("wa:tamahagane").func_111206_d("wa:tamahagane").setCreativeTab(Wa.creativeTab);
	public static Item 食べ物 = (new ItemWaFood(Config.食べ物ID, 5, 0.6F, false)).setUnlocalizedName("wa:food").setCreativeTab(Wa.creativeTab);
	public static Item 金槌 = new ItemKanazuchi(Config.金槌ID, 0).setUnlocalizedName("wa:kanaduchi").func_111206_d("wa:kanaduchi").setCreativeTab(Wa.creativeTab);
	public static Item 竹炭 = new Item(Config.竹炭ID).setUnlocalizedName("wa:takezumi").func_111206_d("wa:takezumi").setCreativeTab(Wa.creativeTab);
	public static Item 鋼の斧 = new ItemAxe(Config.鋼の斧ID, tamahagane).setUnlocalizedName("wa:axe").func_111206_d("wa:axe").setCreativeTab(Wa.creativeTab);
	public static Item 鋼のツルハシ = new ItemPickaxe(Config.鋼のツルハシID, tamahagane).setUnlocalizedName("wa:pickaxe").func_111206_d("wa:pickaxe").setCreativeTab(Wa.creativeTab);
	public static Item 鋼のシャベル = new ItemSpade(Config.鋼のシャベルID, tamahagane).setUnlocalizedName("wa:shovel").func_111206_d("wa:shovel").setCreativeTab(Wa.creativeTab);
	public static Item 鋼のクワ = new ItemHoe(Config.鋼のクワID, tamahagane).setUnlocalizedName("wa:hoe").func_111206_d("wa:hoe").setCreativeTab(Wa.creativeTab);
	public static Item 鋼の金槌 = new ItemKanazuchi(Config.鋼の金槌ID, 0).setUnlocalizedName("wa:steelKanaduchi").func_111206_d("wa:steelKanaduchi").setCreativeTab(Wa.creativeTab);
	public static Item 貨幣 = new ItemCoin(Config.貨幣ID).setUnlocalizedName("wa:kahei").setCreativeTab(Wa.creativeTab);
	public static Item お盆 = new ItemObon(Config.お盆ID).setUnlocalizedName("wa:obon").func_111206_d("wa:obon").setCreativeTab(Wa.creativeTab);
	public static Item 手裏剣 = new ItemShuriken(Config.手裏剣ID).setUnlocalizedName("wa:shuriken").func_111206_d("wa:shuriken").setCreativeTab(Wa.creativeTab);
	public static Item 毛筆 = (new Item(Config.毛筆ID)).setMaxDamage(32).setUnlocalizedName("wa:mouhitsu").func_111206_d("wa:mouhitsu").setCreativeTab(Wa.creativeTab);
	public static Item 掛け軸 = (new ItemShodo(Config.掛け軸ID)).setUnlocalizedName("wa:kakejiku").func_111206_d("wa:kakejiku").setCreativeTab(Wa.creativeTab);
	public static Item 米 = new Item(Config.米ID).setUnlocalizedName("wa:kome").func_111206_d("wa:kome").setCreativeTab(Wa.creativeTab);
	public static Item 種籾 = new ItemSeeds(Config.種籾ID, Blocks.ine.blockID, Block.tilledField.blockID).setUnlocalizedName("wa:tanemomi").func_111206_d("wa:tanemomi").setCreativeTab(Wa.creativeTab);
	public static Item 稲 = new ItemIne(Config.稲ID).setUnlocalizedName("wa:ine").func_111206_d("wa:ine").setCreativeTab(Wa.creativeTab);
	public static Item 御鏡 = new ItemMirror(Config.御鏡ID).setUnlocalizedName("wa:mikagami").func_111206_d("wa:mikagami").setCreativeTab(Wa.creativeTab);
	public static Item 勾玉 = new ItemMagatama(Config.勾玉ID).setUnlocalizedName("wa:magatama").func_111206_d("wa:magatama").setCreativeTab(Wa.creativeTab);

	static Item 家紋;// = new 家紋(Config.家紋ID).setUnlocalizedName("wa:kamon").setCreativeTab(Wa.creativeTab);
	//static Item 陣笠;
	//static Item 提灯;
	//static Item クナイ;

	public static void preInit() {
	}

	public static void init() {
		addNameForObject(玉鋼, "tamahagane", "玉鋼");
		LanguageRegistry.instance().addStringLocalization(EnumFood.onigiri.toString(), "ja_JP", "おにぎり");
		LanguageRegistry.instance().addStringLocalization(EnumFood.odango.toString(), "ja_JP", "お団子");
		for(int i = 0; i < EnumFood.values().length; ++i) {
			addNameForObject(new ItemStack(食べ物, 1, i), EnumFood.values()[i].toString(), getStringLocalization(EnumFood.values()[i].toString(), "ja_JP"));
		}

		//TODO 家紋の名前を設定する
		//TODO 家紋使用時の動作を実装する

		LanguageRegistry.instance().addStringLocalization(EnumCoin.BRONZE_COIN.toString(), "ja_JP", "寛永通宝");
		LanguageRegistry.instance().addStringLocalization(EnumCoin.SILVER_COIN.toString(), "ja_JP", "慶長小玉銀");
		LanguageRegistry.instance().addStringLocalization(EnumCoin.GOLD_COIN.toString(), "ja_JP", "慶長小判");

		for(int i = 0; i < EnumCoin.values().length; ++i) {
			addNameForObject(new ItemStack(貨幣, 1, i), EnumCoin.values()[i].toString(), getStringLocalization(EnumCoin.values()[i].toString(), "ja_JP"));
		}
		addNameForObject(金槌, "kanaduchi", "金槌");
		addNameForObject(鋼の金槌, "StealKanaduchi", "鋼の金槌");

		//金槌は専用のツールカテゴリに登録する
		MinecraftForge.setToolClass(金槌, "hummer", 2);
		MinecraftForge.setToolClass(鋼の金槌, "hummer", 3);

        addNameForObject(太刀, "tachi", "太刀");
		addNameForObject(刀, "katana", "刀");
		addNameForObject(鋼の斧, "stealAxe", "鋼の斧");
		addNameForObject(鋼のツルハシ, "stealPickaxe", "鋼のツルハシ");
		addNameForObject(鋼のシャベル, "stealShovel", "鋼のシャベル");
		addNameForObject(鋼のクワ, "stealHoe", "鋼のクワ");
		//addNameForObject(家紋, "kamon", "家紋");
		addNameForObject(竹炭, "takezumi", "竹炭");
		addNameForObject(お盆, "obon", "お盆");
		addNameForObject(手裏剣, "shuriken", "手裏剣");
		addNameForObject(掛け軸, "kakejiku", "掛け軸");
		addNameForObject(毛筆, "mouhitsu", "毛筆");
		addNameForObject(米, "kome", "米");
		addNameForObject(稲, "ine", "稲");
		addNameForObject(種籾, "tanemomi", "種籾");
		addNameForObject(御鏡, "mikagami", "御鏡");
		addNameForObject(勾玉, "magatama", "勾玉");

		addKakejikuLocalization();
	}

	private static void addKakejikuLocalization() {
		LanguageRegistry.instance().addStringLocalization("syogyo", "ja_JP", "諸行無常");
		LanguageRegistry.instance().addStringLocalization("inga", "ja_JP", "因果応報");
		LanguageRegistry.instance().addStringLocalization("yudan", "ja_JP", "油断大敵");
		LanguageRegistry.instance().addStringLocalization("geijyutu", "ja_JP", "芸術爆発");
		LanguageRegistry.instance().addStringLocalization("bakuhatsu", "ja_JP", "爆発芸術");
		LanguageRegistry.instance().addStringLocalization("yakiniku", "ja_JP", "焼肉定食");
		LanguageRegistry.instance().addStringLocalization("touzai", "ja_JP", "東西南北");
		LanguageRegistry.instance().addStringLocalization("honda", "ja_JP", "本田圭佑");
		LanguageRegistry.instance().addStringLocalization("kingin", "ja_JP", "金銀財宝");
		LanguageRegistry.instance().addStringLocalization("kirisute", "ja_JP", "斬捨御免");
		LanguageRegistry.instance().addStringLocalization("syunka", "ja_JP", "春夏秋冬");

	}

	static String getStringLocalization(String key, String lang) {
		 return LanguageRegistry.instance().getStringLocalization(key, lang);
	}

	static void addNameForObject(Item item, String name, String 名前) {
		LanguageRegistry.instance().addNameForObject(item, "en_US", name);
		LanguageRegistry.instance().addNameForObject(item, "ja_JP", 名前);
	}

	static void addNameForObject(ItemStack itemStack, String name, String 名前) {
		LanguageRegistry.instance().addNameForObject(itemStack, "en_US", name);
		LanguageRegistry.instance().addNameForObject(itemStack, "ja_JP", 名前);
	}
}
