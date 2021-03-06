package mortvana.thaumrev.library;

import mortvana.melteddashboard.item.data.ArmorDataAdv;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.crafting.*;
import thaumcraft.api.research.ResearchItem;
import thaumcraft.api.wands.ItemFocusBasic;

import mortvana.melteddashboard.block.material.MaterialFalseAir;
import mortvana.melteddashboard.item.*;
import mortvana.melteddashboard.world.*;
import mortvana.melteddashboard.world.poorore.PoorOreGenerator;

import mortvana.thaumrev.item.ItemThaumicBauble;
import mortvana.thaumrev.item.ItemArmorInfusable;

import static mortvana.melteddashboard.util.libraries.ColorLibrary.*;
import static mortvana.melteddashboard.util.libraries.StringLibrary.*;
import static net.minecraftforge.event.terraingen.OreGenEvent.GenerateMinable.EventType;

public class ThaumRevLibrary {

	/** MOD CONSTANTS **/
	public static final String MOD_ID = "ThaumicRevelations";
	public static final String MOD_NAME = "Thaumic Revelations";
	public static final String MOD_VERSION = "v0.0.1-PREALPHA-9-26A";
	public static final String MOD_DEPENDENCIES = "required-after:Thaumcraft; after:MagicBees[2.4.1); after:ThermalFoundation";
	public static final String API_NAME = "ThaumicRevelationsAPI";

	public static int researchLevel;

	/** RESEARCH CATEGORIES **/
	public static final String RESEARCH_KEY_MAIN = "TRvMAIN";
	public static final String RESEARCH_KEY_METAL = "TRvMETAL";

	/** ASPECTS **/
	public static Aspect aspectExcubitor;		//Warden
	public static Aspect aspectMagnes;			//Magnetism
	public static Aspect aspectFluxus;			//(Redstone) Flux
	public static Aspect aspectPatefactio;		//Revelations

	/** ENCHANTMENTS **/
	//public static Enchantment enchantStabilizing;

	/** CREATIVE TABS **/
	public static CreativeTabs generalTab;

	/** MATERIALS **/
	public static Material materialFalseAir = new MaterialFalseAir();

	/** BLOCKS **/
	public static Block blockThaumicPlant;
	public static Block blockOre;
	public static Block blockPoorOre;
	public static Block blockGravelOre;

	//public static Block blockFakeAir;
	public static Block blockWoodDecor;
	public static Block blockStoneDecor;
	//public static Block blockMetalDecor;
	//public static Block blockTransparent;
	//public static Block blockLog1;
	//public static Block blockSoil;

	public static Block blockStorageOre;
	public static Block blockStorageAlloy1;
	//public static Block blockStorageAlloy2;
	public static Block blockStorageSpecial;
	public static Block blockStorageEquipment;
	public static Block blockStorageGem;
	public static Block blockStorageMisc;

	//public static Block blockWoodDevice;
	//public static Block blockStoneDevice;
	//public static Block blockMetalDevice;
	//public static Block blockGlassDevice;

	//public static Block blockMagicCrop1;
	//public static Block blockMagicCrop2;
	//public static Block blockMagicCrop3;
	//public static Block blockOreberry1;
	//public static Block blockOreberry2;
	//public static Block blockOreberry3;
	//public static Block blockOreberry4;
	//public static Block blockOreberry5;

	//public static Block blockOreBroken
	//public static Block blockOreCrushed
	//public static Block blockOreDust

	//public static Block blockSlab;
	//public static Block blockSlabDouble;
	//public static Block blockStairs;

	public static Block blockMundaneCrop;

	/** ITEMS **/
	public static FluxGearItemInteractive generalItem;

	public static ItemThaumicBauble thaumicBauble;
	//public static ItemCapacitor itemCapacitor;

	/** ITEMSTACKS **/
	public static ItemStack potato = new ItemStack(Items.potato); //Used for debugging, placeholding, and such

	public static ItemStack excubituraRose;
	public static ItemStack wildCotton;
	public static ItemStack wildThistle;
	public static ItemStack shiverpearl;
	public static ItemStack stormypearl;
	public static ItemStack stonypearl;
	//public static ItemStack blazereed;
	//public static ItemStack blizzreed;
	//public static ItemStack blitzreed;
	//public static ItemStack basalzreed;

	public static ItemStack oreChalcocite;
	public static ItemStack oreSphalerite;
	public static ItemStack oreCassiterite;
	public static ItemStack oreMillerite;
	public static ItemStack oreNativeSilver;
	public static ItemStack oreGalena;
	public static ItemStack oreXenotime;
	public static ItemStack oreWolframite;
	public static ItemStack oreIridosmium;
	public static ItemStack oreBismuthinite;
	public static ItemStack oreTennantite;
	public static ItemStack oreTetrahedrite;
	public static ItemStack orePyrope;
	public static ItemStack oreDioptase;
	public static ItemStack oreJethrineSapphire;
	//public static ItemStack oreMjuvil;

	public static ItemStack orePoorChalcocite;
	public static ItemStack orePoorSphalerite;
	public static ItemStack orePoorCassiterite;
	public static ItemStack orePoorMillerite;
	public static ItemStack orePoorNativeSilver;
	public static ItemStack orePoorGalena;
	public static ItemStack orePoorXenotime;
	public static ItemStack orePoorWolframite;
	public static ItemStack orePoorIridosmium;
	public static ItemStack orePoorBismuthinite;
	public static ItemStack orePoorTennantite;
	public static ItemStack orePoorTetrahedrite;

	public static ItemStack oreGravelChalcocite;
	public static ItemStack oreGravelSphalerite;
	public static ItemStack oreGravelCassiterite;
	public static ItemStack oreGravelMillerite;
	public static ItemStack oreGravelNativeSilver;
	public static ItemStack oreGravelGalena;
	public static ItemStack oreGravelXenotime;
	public static ItemStack oreGravelWolframite;
	public static ItemStack oreGravelIridosmium;
	public static ItemStack oreGravelBismuthinite;
	public static ItemStack oreGravelTennantite;
	public static ItemStack oreGravelTetrahedrite;

	public static ItemStack impregnatedGreatwood;
	public static ItemStack corruptedGreatwood;
	public static ItemStack hardenedSilverwood;

	public static ItemStack wardenicObsidian;
	public static ItemStack eldritchStone;
	public static ItemStack blockWardenicQuartzChiseled;
	public static ItemStack blockWardenicQuartzPillar;
	public static ItemStack blockRedquartzChiseled;
	public static ItemStack blockRedquartzPillar;
	//public static ItemStack blockInfusedQuartzChiseled;
	//public static ItemStack blockInfusedQuartzPillar;
	//public static ItemStack thaumicStone;
	//public static ItemStack infernalBlastBrick;
	//public static ItemStack shadowforgeBrick;

	//public static ItemStack blockMagneoturgicMachinery;

	//public static ItemStack blockContainmentGlass;
	//public static ItemStack blockContainmentGlassLuminous;
	//public static ItemStack blockContainmentGlassDark;

	//public static ItemStack blockSilverwoodTreated;
	//public static ItemStack blockSilverwoodDensified;

	//public static ItemStack blockWardenicLoam;

	public static ItemStack blockCopper;
	public static ItemStack blockZinc;
	public static ItemStack blockTin;
	public static ItemStack blockNickel;
	public static ItemStack blockSilver;
	public static ItemStack blockLead;
	public static ItemStack blockLutetium;
	public static ItemStack blockTungsten;
	public static ItemStack blockIridium;
	public static ItemStack blockBismuth;
	public static ItemStack blockArsenic;
	public static ItemStack blockAntimony;
	public static ItemStack blockNeodymium;
	public static ItemStack blockOsmium;
	public static ItemStack blockPalladium;
	public static ItemStack blockAluminium;

	public static ItemStack blockBrass;
	public static ItemStack blockBronze;
	public static ItemStack blockArsenicalBronze;
	public static ItemStack blockAntimonialBronze;
	public static ItemStack blockBismuthBronze;
	public static ItemStack blockMithril;
	public static ItemStack blockAlumiuiumBronze;
	public static ItemStack blockCupronickel;
	public static ItemStack blockRiftishBronze;
	public static ItemStack blockConstantan;
	public static ItemStack blockInvar;
	public static ItemStack blockElectrum;
	public static ItemStack blockWardenicMetal;
	public static ItemStack blockDullRedsolder;
	public static ItemStack blockRedsolder;

	public static ItemStack blockThaumicElectrum;
	public static ItemStack blockThaumicRiftishBronze;
	public static ItemStack blockSteel;
	public static ItemStack blockThaumicSteel;
	public static ItemStack blockVoidbrass;
	public static ItemStack blockVoidsteel;
	public static ItemStack blockVoidtungsten;
	public static ItemStack blockVoidcupronickel;

	public static ItemStack blockWardenicBronze;
	public static ItemStack blockWardenicSteel;
	public static ItemStack blockWardenicRiftishBronze;
	public static ItemStack blockWardenicComposite;
	public static ItemStack blockArcaneRedsolder;
	public static ItemStack blockRedbronze;
	public static ItemStack blockHardenedRedbronze;
	public static ItemStack blockFluxsteel;
	public static ItemStack blockFluxedTungsten;
	public static ItemStack blockMagneoturgicComposite;
	public static ItemStack blockFluxedComposite;
	public static ItemStack blockResonantFluxedComposite;
	public static ItemStack blockEmpoweredVoidbrass;
	public static ItemStack blockCrimsonThaumium;
	public static ItemStack blockOccultVoidtungsten;

	public static ItemStack blockPyrope;
	public static ItemStack blockDioptase;
	public static ItemStack blockJethrineSapphire;
	public static ItemStack blockJethrinePyroptase;
	public static ItemStack blockWardenicCrystal;
	public static ItemStack blockActivatedWardenicCrystal;
	public static ItemStack blockAwakenedWardenicCrystal;

	public static ItemStack blockWardenicQuartz;
	public static ItemStack blockInfusedQuartz;
	public static ItemStack blockRedquartz;

	public static ItemStack blockLanthanides;
	public static ItemStack blockXenotimeJunk;
	public static ItemStack blockIridosmium;

	public static ItemStack blockThaumicBronze;
	public static ItemStack blockOsmiumLutetium;

	public static ItemStack blockVoidmetal;

	//public static ItemStack blockWardedChest;
	//public static ItemStack blockArcaneLoom;
	//public static ItemStack blockReadingLectern;

	//public static ItemStack blockThaumicHammermill;
	//public static ItemStack blockThaumicHammermillBase;
	//public static ItemStack blockRunicInfuser;

	//public static ItemStack blockDarkRunicInfuser;
	//public static ItemStack blockAlchemicalInfuser;
	//public static ItemStack blockDarkAlchemicalInfuser;
	//public static ItemStack blockShadowCrucible;
	//public static ItemStack blockMagneoturgesWorkbench;
	//public static ItemStack blockAlumentumPressurizer;
	//public static ItemStack blockBrassPipe;
	//public static ItemStack blockChemicalReactor;

	//public static ItemStack blockChemicalReactorTubing;

	//public static ItemStack oreberrySilver;
	//public static ItemStack oreberryLead;
	//public static ItemStack oreberryNickel;
	//public static ItemStack oreberryPlatinum;

	//public static ItemStack oreberryZinc;
	//public static ItemStack oreberryBismuth;
	//public static ItemStack oreberryArsenic;
	//public static ItemStack oreberryAntimony;

	//public static ItemStack oreberryOsmium;
	//public static ItemStack oreberryIridium;
	//public static ItemStack oreberryTungsten;
	//public static ItemStack oreberryPalladium;

	//public static ItemStack oreberryNeodymium;
	//public static ItemStack oreberryLutetium;
	//public static ItemStack oreberryRedstone;
	//public static ItemStack oreberryQuicksilver;

	//public static ItemStack oreberryUranium;
	//public static ItemStack oreberry;
	//public static ItemStack oreberry;
	//public static ItemStack oreberry;

	//public static ItemStack oreXenotimeBroken;
	//public static ItemStack oreTungstenBroken;
	//public static ItemStack oreIridosmiumBroken;
	//public static ItemStack oreTetrahedriteBroken;
	//public static ItemStack oreTennantiteBroken;
	//public static ItemStack oreBismuthBroken;
	//public static ItemStack oreNeodymiumBroken;
	//public static ItemStack oreLutetiumBroken;
	//public static ItemStack oreIridiumBroken;
	//public static ItemStack oreArsenicBroken;
	//public static ItemStack oreAntimonyBroken;

	//public static ItemStack oreXenotimeCrushed;
	//public static ItemStack oreTungstenCrushed;
	//public static ItemStack oreIridosmiumCrushed;
	//public static ItemStack oreTetrahedriteCrushed;
	//public static ItemStack oreTennantiteCrushed;
	//public static ItemStack oreBismuthCrushed;
	//public static ItemStack oreNeodymiumCrushed;
	//public static ItemStack oreLutetiumCrushed;
	//public static ItemStack oreIridiumCrushed;
	//public static ItemStack oreArsenicCrushed;
	//public static ItemStack oreAntimonyCrushed;

	//public static ItemStack oreXenotimePowder;
	//public static ItemStack oreTungstenPowder;
	//public static ItemStack oreIridosmiumPowder;
	//public static ItemStack oreTetrahedritePowder;
	//public static ItemStack oreTennantitePowder;
	//public static ItemStack oreBismuthPowder;
	//public static ItemStack oreNeodymiumPowder;
	//public static ItemStack oreLutetiumPowder;
	//public static ItemStack oreIridiumPowder;
	//public static ItemStack oreArsenicPowder;
	//public static ItemStack oreAntimonyPowder;

	//SLABS/STAIRS
	//public static ItemStack slabWardenicObsidian;
	//public static ItemStack slabEldritch;
	//public static ItemStack slabWardenicQuartz;
	//public static ItemStack stairsWardenicQuartz;

	//GENERAL ITEM
	//00000-00199 GENERAL ITEMS
	public static ItemStack itemCotton;							//00000 //v0.0.1
	public static ItemStack itemCottonFiber;					//00001 //v0.0.1
	public static ItemStack itemCottonFabric;					//00002 //v0.0.1
	public static ItemStack itemCottonTreated;					//00003 //v0.0.1
	public static ItemStack itemCottonEnchanted;				//00004 //v0.0.1
	public static ItemStack itemThistleLeaf;					//00005 //v0.0.1
	public static ItemStack itemThistleFlower;					//00006 //v0.0.1

	public static ItemStack itemArcaneSingularity;				//00010 //v0.0.1
	public static ItemStack itemStabilizedSingularity;			//00011 //v0.0.1
	public static ItemStack itemAnimatedPiston;					//00012 //v0.0.1

	public static ItemStack itemAspectOrbReceptorMakeshift;		//00020 //v0.0.1
	public static ItemStack itemAspectOrbReceptorAdvanced;		//00021 //v0.0.1

	public static ItemStack itemEldritchCog;					//00030 //v0.0.1
	public static ItemStack itemEldritchKeystone;				//00031 //v0.0.1
	public static ItemStack itemSoulFragment;					//00032 //v0.0.1
	public static ItemStack itemPodCinderpearl;					//00033 //v0.0.1
	public static ItemStack itemPodShiverpearl;					//00034 //v0.0.1
	public static ItemStack itemPodStormypearl;					//00035 //v0.0.1
	public static ItemStack itemPodStonypearl;					//00036 //v0.0.1

	public static ItemStack shaftGreatwood;						//00040 //v0.0.1
	public static ItemStack plankGreatwoodEnchanted;			//00041 //v0.0.1
	public static ItemStack shaftGreatwoodEnchanted;			//00042 //v0.0.1

	public static ItemStack itemSilverwoodDensified;			//00050 //v0.0.1
	public static ItemStack plankSilverwoodEnchanted;			//00051 //v0.0.1
	public static ItemStack plankSilverwoodEnchantedDensified;	//00052 //v0.0.1
	public static ItemStack plankSilverwoodConsecrated;			//00053 //v0.0.1
	public static ItemStack shaftSilverwoodEnchanted;			//00054 //v0.0.1
	public static ItemStack shaftSilverwoodConsecrated;			//00055 //v0.0.1

	public static ItemStack chainThaumicBronze;					//00060 //v0.0.1

	//public static ItemStack aluminiumHydroxide;				//00016

	//00850-00849 OREBERRIES
	//public static ItemStack oreberrySilver;
	//public static ItemStack oreberryLead;
	//public static ItemStack oreberryNickel;
	//public static ItemStack oreberryPlatinum;
	//public static ItemStack oreberryZinc;
	//public static ItemStack oreberryBismuth;
	//public static ItemStack oreberryArsenic;
	//public static ItemStack oreberryAntimony;
	//public static ItemStack oreberryOsmium;
	//public static ItemStack oreberryIridium;
	//public static ItemStack oreberryTungsten;
	//public static ItemStack oreberryPalladium;
	//public static ItemStack oreberryNeodymium;
	//public static ItemStack oreberryLutetium;
	//public static ItemStack oreberryRedstone;
	//public static ItemStack oreberryQuicksilver;
	//public static ItemStack oreberryUranium;
	//public static ItemStack oreberry;
	//public static ItemStack oreberry;
	//public static ItemStack oreberry;

	//00950-00999 SEEDS
	public static ItemStack seedExcubitura;						//00950 //v0.0.1
	public static ItemStack seedCotton;							//00951 //v0.0.1
	public static ItemStack seedThistle;						//00952 //v0.0.1
	public static ItemStack seedShimmerleaf;					//00953 //v0.0.1
	public static ItemStack seedCinderpearl;					//00954 //v0.0.1
	public static ItemStack seedShiverpearl;					//00955 //v0.0.1
	public static ItemStack seedStormypearl;						//00956 //v0.0.1
	public static ItemStack seedStonypearl;						//00957 //v0.0.1

	//01000-01199 WARDENIC ARSENAL
	public static ItemStack itemExcubituraPetal;				//01000 //v0.0.1
	public static ItemStack itemExcubituraPaste;				//01001 //v0.0.1
	public static ItemStack itemFabricExcubitura;				//01002 //v0.0.1
	public static ItemStack itemWardencloth;					//01003 //v0.0.1
	//public static ItemStack shaftImpregnatedGreatwood;			//01004 //v0.0.3

	public static ItemStack excubituraOilRaw;					//01035 //v0.0.1
	public static ItemStack excubituraOil;						//01036 //v0.0.1
	public static ItemStack chainWardenicBronze;				//01037 //v0.0.1
	public static ItemStack chainPrimalBronze;					//01038 //v0.0.1
	public static ItemStack plateWardenicBronzeMirror;			//01039 //v0.0.1
	//public static ItemStack bindingWardenicBronze;				//01040 //v0.0.3

	public static ItemStack excubituraOilPure;					//01070 //v0.0.1
	public static ItemStack chainWardenicSteel;					//01071 //v0.0.1
	public static ItemStack chainWardenicSteelOiled;			//01072 //v0.0.1
	public static ItemStack plateWardenicSteelDetailed;			//01073 //v0.0.1
	public static ItemStack plateWardenicSteelRunic;			//01074 //v0.0.1
	public static ItemStack plateWardenicSteelConsecrated;		//01075 //v0.0.1
	//public static ItemStack ingotWardenicSteelSocketed;			//01076 //v0.0.3
	//public static ItemStack bindingWardenicSteelDetailed;		//01077 //v0.0.3
	//public static ItemStack bindingWardenicSteelRunic;			//01078 //v0.0.3
	//public static ItemStack bindingWardenicSteelConsecrated;	//01079 //v0.0.3

	public static ItemStack plateWardenicCompositeInfused;		//01105 //v0.0.1
	public static ItemStack plateWardenicCompositeFitted;		//01106 //v0.0.1
	public static ItemStack plateWardenicCompositeDetailed;		//01107 //v0.0.1
	public static ItemStack plateWardenicCompositeRunic;		//01108 //v0.0.1
	public static ItemStack plateWardenicCompositeConsecrated;	//01109 //v0.0.1
	public static ItemStack plateWardenicCompositePrimal;		//01110 //v0.0.1
	//public static ItemStack plateWardenicCompositeFolded;		//01111 //v0.0.3
	//public static ItemStack bindingWardenicComposite;			//01112 //v0.0.3
	//public static ItemStack bindingWardenicCompositeDetailed;	//01113 //v0.0.3
	//public static ItemStack bindingWardenicCompositeRunic;		//01114 //v0.0.3
	//public static ItemStack bindingWardenicCompositeConsecrated;//01115 //v0.0.3
	//public static ItemStack bindingWardenicCompositePrimal;		//01116 //v0.0.3
	//public static ItemStack shaftSilverwoodWardenclothWrapped;	//01117 //v0.0.3
	//public static ItemStack itemSilkSilverwood;					//01118 //v0.0.2
	//public static ItemStack itemSilkSilverwoodConsecrated;		//01119 //v0.0.2
	//public static ItemStack itemSilvercloth;					//01120 //v0.0.2
	//public static ItemStack itemSilverclothRunic;				//01121 //v0.0.2
	//public static ItemStack itemSilverclothConsecrated;			//01122 //v0.0.2
	//public static ItemStack itemSilverclothPrimal;				//01123 //v0.0.2

	public static ItemStack itemEssenceOfAwakening;				//01140

	public static ItemStack wardenicHardener;					//01175 //v0.0.1

	//01200-01399 MAGNEOTURGY - EQUIPMENT
	public static ItemStack itemFabricRedstone;					//01200 //v0.0.1
	public static ItemStack itemRedcloth;						//01201 //v0.0.1
	public static ItemStack itemRedclothCapacitive;				//01202 //v0.0.1
	//public static ItemStack bindingArcaneRedsolder;				//01203 //v0.0.3

	//public static ItemStack itemFabricEnrichedRedstone;			//01235	//v0.0.2
	//public static ItemStack itemRedclothEnriched;				//01236	//v0.0.2
	//public static ItemStack itemRedclothPadded;					//01237	//v0.0.2
	//public static ItemStack itemRedclothRunic;					//01238	//v0.0.2
	//public static ItemStack itemRedclothPrimal;					//01239	//v0.0.2
	//public static ItemStack bindingHardenedRedbronze;			//01240	//v0.0.3
	//public static ItemStack bindingHardenedRedbronzeCapacitive;	//01241	//v0.0.3

	//public static ItemStack itemCapacitorSocket;				//01270	//v0.0.2
	//public static ItemStack threadRedcotton;				//01271	//v0.0.2
	//public static ItemStack threadFluxsteel;					//01272	//v0.0.2
	//public static ItemStack itemReddenim;						//01273	//v0.0.2
	//public static ItemStack itemReddenimEnchanted;				//01274	//v0.0.2
	//public static ItemStack itemReddenimDetailed;				//01275	//v0.0.2
	//public static ItemStack itemReddenimCharged;				//01276	//v0.0.2
	//public static ItemStack itemReddenimRunic;					//01277	//v0.0.2
	//public static ItemStack itemReddenimEnergized;				//01278	//v0.0.2
	//public static ItemStack itemReddenimSocketed;				//01279	//v0.0.2
	//public static ItemStack shaftGreatwoodHollow;				//01280	//v0.0.3
	//public static ItemStack shaftGreatwoodWired;				//01281	//v0.0.3
	//public static ItemStack shaftGreatwoodSocketed;				//01282	//v0.0.3
	//public static ItemStack bindingFluxsteel;					//01283	//v0.0.3
	//public static ItemStack bindingFluxsteelReinforced;			//01284	//v0.0.3
	//public static ItemStack plateFluxsteelFolded;				//01285	//v0.0.3

	//public static ItemStack threadFluxedComposite;				//01305	//v0.0.2
	//public static ItemStack itemReddenimCompsite;				//01306	//v0.0.2
	//public static ItemStack itemReddenimEnchantedCompsite;		//01307	//v0.0.2
	//public static ItemStack itemReddenimDetailedCompsite;		//01308	//v0.0.2
	//public static ItemStack itemReddenimChargedCompsite;		//01309	//v0.0.2
	//public static ItemStack itemReddenimRunicCompsite;			//01310	//v0.0.2
	//public static ItemStack itemReddenimEnergizedCompsite;		//01311	//v0.0.2
	//public static ItemStack itemReddenimSocketedCompsite;		//01312	//v0.0.2
	//public static ItemStack itemReddenimPrimalCompsite;			//01313	//v0.0.2
	//public static ItemStack plateFluxedCompositeInfused;		//01314	//v0.0.3
	//public static ItemStack plateFluxedCompositeFolded;			//01315	//v0.0.3
	//public static ItemStack plateFluxedCompositeEnergized;		//01316	//v0.0.3
	//public static ItemStack bindingFluxedComposite;				//01317	//v0.0.3
	//public static ItemStack bindingFluxedCompositeDetailed;		//01318	//v0.0.3
	//public static ItemStack bindingFluxedCompositeRunic;		//01319	//v0.0.3
	//public static ItemStack bindingFluxedCompositeEnergized;	//01320	//v0.0.3
	//public static ItemStack bindingFluxedCompositeSocketed;		//01321	//v0.0.3
	//public static ItemStack itemHardenedFluxedCompositePlates;	//01322	//v0.0.2
	//public static ItemStack itemRivetsFluxsteel;				//01323	//v0.0.2
	//public static ItemStack itemReddenimEnchantedRiveted;		//01324	//v0.0.2
	//public static ItemStack itemReddenimDetailedRiveted;		//01325	//v0.0.2
	//public static ItemStack itemReddenimChargedRiveted;			//01326	//v0.0.2
	//public static ItemStack itemReddenimRunicRiveted;			//01327	//v0.0.2
	//public static ItemStack itemReddenimEnergizedRiveted;		//01328	//v0.0.2
	//public static ItemStack itemReddenimSocketedRiveted;		//01329	//v0.0.2

	//public static ItemStack itemCapacitorSocketResonant;		//01340	//v0.0.2
	//public static ItemStack threadResonantFluxedComposite;		//01341	//v0.0.2
	//public static ItemStack itemResonantFluxedCompositeStuds;	//01342	//v0.0.2
	//public static ItemStack bindingResonant;					//01343	//v0.0.2
	//public static ItemStack shaftResonant;						//01344	//v0.0.2


	//01400-01599 ELDTRICH

	//01600-01799 MAGNEOTURGY - BASE
	public static ItemStack itemCapacitorCoreArcaneRedsolder;	//01600 //v0.0.1
	//public static ItemStack itemCapacitorCoreLayeredRedsolder;	//01601 //v0.0.2
	//public static ItemStack itemCapacitorCoreElectrumCore;		//01602 //v0.0.2
	//public static ItemStack itemCapacitorCoreHighResonance;		//01603 //v0.0.2
	//public static ItemStack itemCapacitorCorePiezomagnetic;		//01604 //v0.0.2
	//public static ItemStack itemCapacitorCoreMagneoturge;		//01605 //v0.0.2
	//public static ItemStack itemCapacitorCoreUltraHighResonance;//01606 //v0.0.2

	//public static ItemStack itemCapacitorCatalystAgNd;			//01610 //v0.0.2
	//public static ItemStack itemCapacitorCatalystAgAuNdPd;		//01611 //v0.0.2

	//public static ItemStack itemCapacitorCasingPbAgAu;			//01615 //v0.0.2
	//public static ItemStack itemCapacitorCasingOsLuW;			//01616 //v0.0.2

	//public static ItemStack itemRedstoneEssence;				//01620 //v0.0.2
	//public static ItemStack itemQuartzCircuitPlate;				//01621 //v0.0.2
	//public static ItemStack itemCognitionCore;					//01622 //v0.0.2
	//public static ItemStack itemResonanceModulationCoil;		//01623 //v0.0.2
	//public static ItemStack itemCircuitryHex;					//01624 //v0.0.2
	//public static ItemStack itemImprintedPyroptaseDataLibrary;	//01625 //v0.0.2
	//public static ItemStack itemAnalyticCore;					//01626 //v0.0.2
	//public static ItemStack itemRedstoneElectrolyte;			//01627 //v0.0.2

	//public static ItemStack itemRedstoneEssenceResonant;		//01630 //v0.0.2
	//public static ItemStack itemBlueFluxstoneEssence;			//01631 //v0.0.2
	//public static ItemStack itemBlueFluxstoneEssenceResonant;	//01632 //v0.0.2
	//public static ItemStack itemEnergizedAgCuPaste;				//01633 //v0.0.2

	//public static ItemStack itemEssenceOfResonance;				//01640	//v0.0.2


	//01800-01999 THAUMIC ASCENSION
	//02000-02199 RUNIC MECHANICS
	//02200-02399 TRANSMUTIVE ENGINEERING
	//02400-02599 THAUMIC DYNAMICS
	//02600-02799 CHRONOTURGY
	//02800-02999 ASTROTURGY/MISC


	//03000-03099 WAND CAPS
	//public static ItemStack wandCapLead;						//03000	//v0.0.2
	//public static ItemStack wandCapBismuth;						//03001	//v0.0.2
	//public static ItemStack wandCapBronze;						//03002	//v0.0.2
	//public static ItemStack wandCapBrass;						//03003	//v0.0.2
	//public static ItemStack wandCapInvar;						//03004	//v0.0.2
	//public static ItemStack wandCapElectrumInert;				//03005	//v0.0.2
	//public static ItemStack wandCapElectrum;					//03006	//v0.0.2
	//public static ItemStack wandCapPlatinumInert;				//03007	//v0.0.2
	//public static ItemStack wandCapPlatinum;					//03008	//v0.0.2
	//public static ItemStack wandCapSignalumInert;				//03009	//v0.0.2
	//public static ItemStack wandCapSignalum;					//03010	//v0.0.2
	//public static ItemStack wandCapLumiumInert;					//03011	//v0.0.2
	//public static ItemStack wandCapLumium;						//03012	//v0.0.2
	//public static ItemStack wandCapEnderiumInert;				//03013	//v0.0.2
	//public static ItemStack wandCapEnderium;					//03014	//v0.0.2
	//public static ItemStack wandCapThaumicElectrumInert;		//03015	//v0.0.2
	//public static ItemStack wandCapThaumicElectrum;				//03016	//v0.0.2

	//03100-03199 WAND CORES
	//public static ItemStack wandCoreBloodwood;					//03100	//v0.0.2

	//03200-03299 STAFF CORES
	//public static ItemStack staffCoreBloodwood;					//03200	//v0.0.2

	//public static ItemStack staffCoreTTKami;						//03290	//v0.0.2


	//03300-03499 AUGMENTS
	//03500-03599 GOLEM STUFF

	//04900-04999 BACKUPS
	public static ItemStack powderBlizzBackup;					//04900
	public static ItemStack powderBlitzBackup;					//04901
	public static ItemStack powderBasalzBackup;					//04902

	public static ItemStack rodBlizzBackup;						//04905
	public static ItemStack rodBlitzBackup;						//04906
	public static ItemStack rodBasalzBackup;					//04907

	//05000-05031 ELEMENTAL METAL INGOTS
	public static ItemStack ingotCopper;						//05000
	public static ItemStack ingotZinc;							//05001
	public static ItemStack ingotTin;							//05002
	public static ItemStack ingotNickel;						//05003
	public static ItemStack ingotSilver;						//05004
	public static ItemStack ingotLead;							//05005
	public static ItemStack ingotLutetium;						//05006
	public static ItemStack ingotTungsten;						//05007
	public static ItemStack ingotIridium;						//05008
	public static ItemStack ingotBismuth;						//05009
	public static ItemStack ingotArsenic;						//05010
	public static ItemStack ingotAntimony;						//05011
	public static ItemStack ingotNeodymium;						//05012
	public static ItemStack ingotOsmium;						//05013
	public static ItemStack ingotPalladium;						//05014
	public static ItemStack ingotAluminium;						//05015

	//05032-05063 SIMPLE ALLOY INGOTS
	public static ItemStack ingotBrass;							//05032
	public static ItemStack ingotBronze;						//05033
	public static ItemStack ingotArsenicalBronze;				//05034
	public static ItemStack ingotAntimonialBronze;				//05035
	public static ItemStack ingotBismuthBronze;					//05036
	public static ItemStack ingotMithril;						//05037
	public static ItemStack ingotAluminiumBronze;				//05038
	public static ItemStack ingotCupronickel;					//05039
	public static ItemStack ingotRiftishBronze;					//05040
	public static ItemStack ingotConstantan;					//05041
	public static ItemStack ingotInvar;							//05042
	public static ItemStack ingotElectrum;						//05043
	public static ItemStack ingotWardenicMetal;					//05044
	public static ItemStack ingotDullRedsolder;					//05045
	public static ItemStack ingotRedsolder;						//05046

	//05064-05079 SPECIAL ALLOY INGOTS
	public static ItemStack ingotThaumicElectrum;				//05064
	public static ItemStack ingotThaumicRiftishBronze;			//05065
	public static ItemStack ingotSteel;							//05066
	public static ItemStack ingotThaumicSteel;					//05067
	public static ItemStack ingotVoidbrass;						//05068
	public static ItemStack ingotVoidsteel;						//05069
	public static ItemStack ingotVoidtungsten;					//05070
	public static ItemStack ingotVoidcupronickel;				//05071

	//05080-05095 EQUIPMENT ALLOY INGOTS
	public static ItemStack ingotWardenicBronze;				//05080
	public static ItemStack ingotWardenicSteel;					//05081
	public static ItemStack ingotWardenicRiftishBronze;			//05082
	public static ItemStack ingotWardenicComposite;				//05083
	public static ItemStack ingotArcaneRedsolder;				//05084
	public static ItemStack ingotRedbronze;						//05085
	public static ItemStack ingotHardenedRedbronze;				//05086
	public static ItemStack ingotFluxsteel;						//05087
	public static ItemStack ingotFluxedTungsten;				//05088
	public static ItemStack ingotMagneoturgicComposite;			//05089
	public static ItemStack ingotFluxedComposite;				//05090
	public static ItemStack ingotResonantFluxedComposite;		//05091
	public static ItemStack ingotEmpoweredVoidbrass;			//05092
	public static ItemStack ingotCrimsonThaumium;				//05093
	public static ItemStack ingotOccultVoidtungsten;			//05094

	//05096-05111 GEMS
	public static ItemStack gemPyrope;							//05096
	public static ItemStack gemDioptase;						//05097
	public static ItemStack gemJethrineSapphire;					//05098
	public static ItemStack gemJethrinePyroptase;				//05099
	public static ItemStack gemWardenicCrystal;					//05100
	public static ItemStack gemActivatedWardenicCrystal;		//05101
	public static ItemStack gemAwakenedWardenicCrystal;			//05102

	public static ItemStack gemWardenicQuartz;					//05104
	public static ItemStack gemInfusedQuartz;					//05105
	public static ItemStack gemRedquartz;						//05106

	//05112-05127 OTHER METAL INGOTS
	public static ItemStack ingotLanthanides;					//05112
	public static ItemStack ingotXenotimeJunk;					//05113
	public static ItemStack ingotIridosmium;					//05114

	public static ItemStack ingotThaumicBronze;					//05120
	public static ItemStack ingotOsmiumLutetium;				//05121

	//05200-05231 ELEMENTAL METAL NUGGETS
	public static ItemStack nuggetCopper;						//05200
	public static ItemStack nuggetZinc;							//05201
	public static ItemStack nuggetTin;							//05202
	public static ItemStack nuggetNickel;						//05203
	public static ItemStack nuggetSilver;						//05204
	public static ItemStack nuggetLead;							//05205
	public static ItemStack nuggetLutetium;						//05206
	public static ItemStack nuggetTungsten;						//05207
	public static ItemStack nuggetIridium;						//05208
	public static ItemStack nuggetBismuth;						//05209
	public static ItemStack nuggetArsenic;						//05210
	public static ItemStack nuggetAntimony;						//05211
	public static ItemStack nuggetNeodymium;					//05212
	public static ItemStack nuggetOsmium;						//05213
	public static ItemStack nuggetPalladium;					//05214
	public static ItemStack nuggetAluminium;					//05215

	//05232-05263 SIMPLE ALLOY NUGGETS
	public static ItemStack nuggetBrass;						//05232
	public static ItemStack nuggetBronze;						//05233
	public static ItemStack nuggetArsenicalBronze;				//05234
	public static ItemStack nuggetAntimonialBronze;				//05235
	public static ItemStack nuggetBismuthBronze;				//05236
	public static ItemStack nuggetMithril;						//05237
	public static ItemStack nuggetAluminiumBronze;				//05238
	public static ItemStack nuggetCupronickel;					//05239
	public static ItemStack nuggetRiftishBronze;				//05240
	public static ItemStack nuggetConstantan;					//05241
	public static ItemStack nuggetInvar;						//05242
	public static ItemStack nuggetElectrum;						//05243
	public static ItemStack nuggetWardenicMetal;				//05244
	public static ItemStack nuggetDullRedsolder;				//05245
	public static ItemStack nuggetRedsolder;					//05246

	//05264-05279 SPECIAL ALLOY NUGGETS
	public static ItemStack nuggetThaumicElectrum;				//05264
	public static ItemStack nuggetThaumicRiftishBronze;			//05265
	public static ItemStack nuggetSteel;						//05266
	public static ItemStack nuggetThaumicSteel;					//05267
	public static ItemStack nuggetVoidbrass;					//05268
	public static ItemStack nuggetVoidsteel;					//05269
	public static ItemStack nuggetVoidtungsten;					//05270
	public static ItemStack nuggetVoidcupronickel;				//05271

	//05280-05295 EQUIPMENT ALLOY NUGGETS
	public static ItemStack nuggetWardenicBronze;				//05280
	public static ItemStack nuggetWardenicSteel;				//05281
	public static ItemStack nuggetWardenicRiftishBronze;		//05282
	public static ItemStack nuggetWardenicComposite;			//05283
	public static ItemStack nuggetArcaneRedsolder;				//05284
	public static ItemStack nuggetRedbronze;					//05285
	public static ItemStack nuggetHardenedRedbronze;			//05286
	public static ItemStack nuggetFluxsteel;					//05287
	public static ItemStack nuggetFluxedTungsten;				//05288
	public static ItemStack nuggetMagneoturgicComposite;		//05289
	public static ItemStack nuggetFluxedComposite;				//05290
	public static ItemStack nuggetResonantFluxedComposite;		//05291
	public static ItemStack nuggetEmpoweredVoidbrass;			//05292
	public static ItemStack nuggetCrimsonThaumium;				//05293
	public static ItemStack nuggetOccultVoidtungsten;			//05294

	//05296-05311 GEM SHARDS
	public static ItemStack shardPyrope;						//05296
	public static ItemStack shardDioptase;						//05297
	public static ItemStack shardJethrineSapphire;				//05298
	public static ItemStack shardJethrinePyroptase;				//05299
	public static ItemStack shardWardenicCrystal;				//05300
	public static ItemStack shardActivatedWardenicCrystal;		//05301
	public static ItemStack shardAwakenedWardenicCrystal;		//05302

	public static ItemStack shardWardenicQuartz;				//05304
	public static ItemStack shardInfusedQuartz;					//05305
	public static ItemStack shardRedquartz;						//05306

	//05312-05327 OTHER METAL NUGGETS
	public static ItemStack nuggetLanthanides;					//05312
	public static ItemStack nuggetXenotimeJunk;					//05313
	public static ItemStack nuggetIridosmium;					//05314

	public static ItemStack nuggetThaumicBronze;				//05320
	public static ItemStack nuggetOsmiumLutetium;				//05321

	//05400-05431 ELEMENTAL METAL DUSTS
	public static ItemStack dustCopper;							//05400
	public static ItemStack dustZinc;							//05401
	public static ItemStack dustTin;							//05402
	public static ItemStack dustNickel;							//05403
	public static ItemStack dustSilver;							//05404
	public static ItemStack dustLead;							//05405
	public static ItemStack dustLutetium;						//05406
	public static ItemStack dustTungsten;						//05407
	public static ItemStack dustIridium;						//05408
	public static ItemStack dustBismuth;						//05409
	public static ItemStack dustArsenic;						//05410
	public static ItemStack dustAntimony;						//05411
	public static ItemStack dustNeodymium;						//05412
	public static ItemStack dustOsmium;							//05413
	public static ItemStack dustPalladium;						//05414
	public static ItemStack dustAluminium;						//05415

	//05432-05463 SIMPLE ALLOY DUSTS
	public static ItemStack dustBrass;							//05432
	public static ItemStack dustBronze;							//05433
	public static ItemStack dustArsenicalBronze;				//05434
	public static ItemStack dustAntimonialBronze;				//05435
	public static ItemStack dustBismuthBronze;					//05436
	public static ItemStack dustMithril;						//05437
	public static ItemStack dustAluminiumBronze;				//05438
	public static ItemStack dustCupronickel;					//05439
	public static ItemStack dustRiftishBronze;					//05440
	public static ItemStack dustConstantan;						//05441
	public static ItemStack dustInvar;							//05442
	public static ItemStack dustElectrum;						//05443
	public static ItemStack dustWardenicMetal;					//05444
	public static ItemStack dustDullRedsolder;					//05445
	public static ItemStack dustRedsolder;						//05446

	//05464-05479 SPECIAL ALLOY DUSTS
	public static ItemStack dustThaumicElectrum;				//05464
	public static ItemStack dustThaumicRiftishBronze;			//05465
	public static ItemStack dustSteel;							//05466
	public static ItemStack dustThaumicSteel;					//05467
	public static ItemStack dustVoidbrass;						//05468
	public static ItemStack dustVoidsteel;						//05469
	public static ItemStack dustVoidtungsten;					//05470
	public static ItemStack dustVoidcupronickel;				//05471

	//05480-05495 EQUIPMENT ALLOY DUSTS
	public static ItemStack dustWardenicBronze;					//05480
	public static ItemStack dustWardenicSteel;					//05481
	public static ItemStack dustWardenicRiftishBronze;			//05482
	public static ItemStack dustWardenicComposite;				//05483
	public static ItemStack dustArcaneRedsolder;				//05484
	public static ItemStack dustRedbronze;						//05485
	public static ItemStack dustHardenedRedbronze;				//05486
	public static ItemStack dustFluxsteel;						//05487
	public static ItemStack dustFluxedTungsten;					//05488
	public static ItemStack dustMagneoturgicComposite;			//05489
	public static ItemStack dustFluxedComposite;				//05490
	public static ItemStack dustResonantFluxedComposite;		//05491
	public static ItemStack dustEmpoweredVoidbrass;				//05492
	public static ItemStack dustCrimsonThaumium;				//05493
	public static ItemStack dustOccultVoidtungsten;				//05494

	//05496-05511 GEM DUSTS
	public static ItemStack dustPyrope;							//05496
	public static ItemStack dustDioptase;						//05497
	public static ItemStack dustJethrineSapphire;				//05498
	public static ItemStack dustJethrinePyroptase;				//05499
	public static ItemStack dustWardenicCrystal;				//05500
	public static ItemStack dustActivatedWardenicCrystal;		//05501
	public static ItemStack dustAwakenedWardenicCrystal;		//05502

	public static ItemStack dustWardenicQuartz;					//05504
	public static ItemStack dustInfusedQuartz;					//05505
	public static ItemStack dustRedquartz;						//05506

	//05512-05527 OTHER METAL DUSTS
	public static ItemStack dustLanthanides;					//05512
	public static ItemStack dustXenotimeJunk;					//05513
	public static ItemStack dustIridosmium;						//05514

	public static ItemStack dustThaumicBronze;					//05520
	public static ItemStack dustOsmiumLutetium;					//05521

	//05600-05631 ELEMENTAL METAL TINY DUSTS
	public static ItemStack tinyCopper;							//05600
	public static ItemStack tinyZinc;							//05601
	public static ItemStack tinyTin;							//05602
	public static ItemStack tinyNickel;							//05603
	public static ItemStack tinySilver;							//05604
	public static ItemStack tinyLead;							//05605
	public static ItemStack tinyLutetium;						//05606
	public static ItemStack tinyTungsten;						//05607
	public static ItemStack tinyIridium;						//05608
	public static ItemStack tinyBismuth;						//05609
	public static ItemStack tinyArsenic;						//05610
	public static ItemStack tinyAntimony;						//05611
	public static ItemStack tinyNeodymium;						//05612
	public static ItemStack tinyOsmium;							//05613
	public static ItemStack tinyPalladium;						//05614
	public static ItemStack tinyAluminium;						//05615

	//05632-05663 SIMPLE ALLOY TINY DUSTS
	public static ItemStack tinyBrass;							//05632
	public static ItemStack tinyBronze;							//05633
	public static ItemStack tinyArsenicalBronze;				//05634
	public static ItemStack tinyAntimonialBronze;				//05635
	public static ItemStack tinyBismuthBronze;					//05636
	public static ItemStack tinyMithril;						//05637
	public static ItemStack tinyAluminiumBronze;				//05638
	public static ItemStack tinyCupronickel;					//05639
	public static ItemStack tinyRiftishBronze;					//05640
	public static ItemStack tinyConstantan;						//05641
	public static ItemStack tinyInvar;							//05642
	public static ItemStack tinyElectrum;						//05643
	public static ItemStack tinyWardenicMetal;					//05644
	public static ItemStack tinyDullRedsolder;					//05645
	public static ItemStack tinyRedsolder;						//05646

	//05664-05679 SPECIAL ALLOY TINY DUSTS
	public static ItemStack tinyThaumicElectrum;				//05664
	public static ItemStack tinyThaumicRiftishBronze;			//05665
	public static ItemStack tinySteel;							//05666
	public static ItemStack tinyThaumicSteel;					//05667
	public static ItemStack tinyVoidbrass;						//05668
	public static ItemStack tinyVoidsteel;						//05669
	public static ItemStack tinyVoidtungsten;					//05670
	public static ItemStack tinyVoidcupronickel;				//05671

	//05680-05695 EQUIPMENT ALLOY TINY DUSTS
	public static ItemStack tinyWardenicBronze;					//05680
	public static ItemStack tinyWardenicSteel;					//05681
	public static ItemStack tinyWardenicRiftishBronze;			//05682
	public static ItemStack tinyWardenicComposite;				//05683
	public static ItemStack tinyArcaneRedsolder;				//05684
	public static ItemStack tinyRedbronze;						//05685
	public static ItemStack tinyHardenedRedbronze;				//05686
	public static ItemStack tinyFluxsteel;						//05687
	public static ItemStack tinyFluxedTungsten;					//05688
	public static ItemStack tinyMagneoturgicComposite;			//05689
	public static ItemStack tinyFluxedComposite;				//05690
	public static ItemStack tinyResonantFluxedComposite;		//05691
	public static ItemStack tinyEmpoweredVoidbrass;				//05692
	public static ItemStack tinyCrimsonThaumium;				//05693
	public static ItemStack tinyOccultVoidtungsten;				//05694

	//05696-05711 GEM TINY DUSTS
	public static ItemStack tinyPyrope;							//05696
	public static ItemStack tinyDioptase;						//05697
	public static ItemStack tinyJethrineSapphire;				//05698
	public static ItemStack tinyJethrinePyroptase;				//05699
	public static ItemStack tinyWardenicCrystal;				//05700
	public static ItemStack tinyActivatedWardenicCrystal;		//05701
	public static ItemStack tinyAwakenedWardenicCrystal;		//05702

	public static ItemStack tinyWardenicQuartz;					//05704
	public static ItemStack tinyInfusedQuartz;					//05705
	public static ItemStack tinyRedquartz;						//05706

	//05712-05727 OTHER METAL TINY DUSTS
	public static ItemStack tinyLanthanides;					//05712
	public static ItemStack tinyXenotimeJunk;					//05713
	public static ItemStack tinyIridosmium;						//05714

	public static ItemStack tinyThaumicBronze;					//05720
	public static ItemStack tinyOsmiumLutetium;					//05721

	//05800-05831 ELEMENTAL METAL PLATES
	public static ItemStack plateCopper;						//05800
	public static ItemStack plateZinc;							//05801
	public static ItemStack plateTin;							//05802
	public static ItemStack plateNickel;						//05803
	public static ItemStack plateSilver;						//05804
	public static ItemStack plateLead;							//05805
	public static ItemStack plateLutetium;						//05806
	public static ItemStack plateTungsten;						//05807
	public static ItemStack plateIridium;						//05808
	public static ItemStack plateBismuth;						//05809
	public static ItemStack plateArsenic;						//05810
	public static ItemStack plateAntimony;						//05811
	public static ItemStack plateNeodymium;						//05812
	public static ItemStack plateOsmium;						//05813
	public static ItemStack platePalladium;						//05814
	public static ItemStack plateAluminium;						//05815

	//05832-05863 SIMPLE ALLOY PLATES
	public static ItemStack plateBrass;							//05832
	public static ItemStack plateBronze;						//05833
	public static ItemStack plateArsenicalBronze;				//05834
	public static ItemStack plateAntimonialBronze;				//05835
	public static ItemStack plateBismuthBronze;					//05836
	public static ItemStack plateMithril;						//05837
	public static ItemStack plateAluminiumBronze;				//05838
	public static ItemStack plateCupronickel;					//05839
	public static ItemStack plateRiftishBronze;					//05840
	public static ItemStack plateConstantan;					//05841
	public static ItemStack plateInvar;							//05842
	public static ItemStack plateElectrum;						//05843
	public static ItemStack plateWardenicMetal;					//05844
	public static ItemStack plateDullRedsolder;					//05845
	public static ItemStack plateRedsolder;						//05846

	//05864-05879 SPECIAL ALLOY PLATES
	public static ItemStack plateThaumicElectrum;				//05864
	public static ItemStack plateThaumicRiftishBronze;			//05865
	public static ItemStack plateSteel;							//05866
	public static ItemStack plateThaumicSteel;					//05867
	public static ItemStack plateVoidbrass;						//05868
	public static ItemStack plateVoidsteel;						//05869
	public static ItemStack plateVoidtungsten;					//05870
	public static ItemStack plateVoidcupronickel;				//05871

	//05880-05895 EQUIPMENT ALLOY PLATES
	public static ItemStack plateWardenicBronze;				//05880
	public static ItemStack plateWardenicSteel;					//05881
	public static ItemStack plateWardenicRiftishBronze;			//05882
	public static ItemStack plateWardenicComposite;				//05883
	public static ItemStack plateArcaneRedsolder;				//05884
	public static ItemStack plateRedbronze;						//05885
	public static ItemStack plateHardenedRedbronze;				//05886
	public static ItemStack plateFluxsteel;						//05887
	public static ItemStack plateFluxedTungsten;				//05888
	public static ItemStack plateMagneoturgicComposite;			//05889
	public static ItemStack plateFluxedComposite;				//05890
	public static ItemStack plateResonantFluxedComposite;		//05891
	public static ItemStack plateEmpoweredVoidbrass;			//05892
	public static ItemStack plateCrimsonThaumium;				//05893
	public static ItemStack plateOccultVoidtungsten;			//05894

	//05920-05927 OTHER METAL PLATES
	public static ItemStack plateThaumicBronze;					//05920
	public static ItemStack plateOsmiumLutetium;				//05921

	//06032-06063 RAW SIMPLE ALLOY INGOTS
	public static ItemStack rawBrass;							//06032
	public static ItemStack rawBronze;							//06033
	public static ItemStack rawArsenicalBronze;					//06034
	public static ItemStack rawAntimonialBronze;				//06035
	public static ItemStack rawBismuthBronze;					//06036
	public static ItemStack rawMithril;							//06037
	public static ItemStack rawAluminiumBronze;					//06038
	public static ItemStack rawCupronickel;						//06039
	public static ItemStack rawRiftishBronze;					//06040
	public static ItemStack rawConstantan;						//06041
	public static ItemStack rawInvar;							//06042
	public static ItemStack rawElectrum;						//06043
	public static ItemStack rawWardenicMetal;					//06044
	public static ItemStack rawDullRedsolder;					//06045
	public static ItemStack rawRedsolder;						//06046

	//06080-06095 RAW COMPOSITES
	public static ItemStack rawWardenicComposite;				//06083
	public static ItemStack rawArcaneRedsolder;					//06084
	public static ItemStack rawMagneoturgicComposite;			//06089

	//06096-06111 COMPOUND GEM BLENDS
	public static ItemStack blendJethrinePyrotase;				//06099

	//06112-06127 RAW COMPLEX ALLOY INGOTS
	public static ItemStack rawThaumicBronze;					//06120
	public static ItemStack rawOsLu;							//06121

	//06280-06295 SMELTED COMPOSITE INGOTS
	public static ItemStack smeltedWardenicComposite;			//05883
	public static ItemStack smeltedMagneoturgicComposite;		//05889
	public static ItemStack smeltedFluxedComposite;				//05890
	public static ItemStack smeltedResonantFluxedComposite;		//05891

	//06312-06327 COATED COMPLEX ALLOY INGOTS
	public static ItemStack coatedThaumicBronze;				//06320
	public static ItemStack coatedOsLu;							//06321

	//06312-06327 FIRED COMPLEX ALLOY INGOTS
	public static ItemStack firedThaumicBronze;					//06520
	public static ItemStack firedOsLu;							//06521

	//07000-07099 ORE CLUSTERS
	//public static ItemStack clusterUranium;
	public static ItemStack clusterZinc;						//07001
	public static ItemStack clusterAluminium;					//07002
	public static ItemStack clusterNickel;						//07003
	public static ItemStack clusterPlatinum;					//07004
	//public static ItemStack clusterOsmium
	public static ItemStack clusterXenotime;					//07006
	public static ItemStack clusterTungsten;					//07007
	public static ItemStack clusterIridosmium;					//07008
	public static ItemStack clusterBismuth;						//07009
	public static ItemStack clusterTennantite;					//07010
	public static ItemStack clusterTetrahedrite;				//07011
	//public static ItemStack clusterMagnetite;
	//public static ItemStack clusterCadmium
	//public static ItemStack clusterIndium
	//public static ItemStack clusterPitchblende
	//public static ItemStack clusterNetherCobalt
	//public static ItemStack clusterNetherArdite
	//public static ItemStack clusterChromite
	//public static ItemStack clusterCobaltite
	//public static ItemStack clusterMolybdenite
	//public static ItemStack clusterIlmenite
	//public static ItemStack clusterBraggite
	//public static ItemStack clusterSylvanite
	//public static ItemStack cluster
	//public static ItemStack cluster
	//public static ItemStack cluster
	//public static ItemStack cluster
	//public static ItemStack cluster
	//public static ItemStack cluster
	//public static ItemStack cluster
	//public static ItemStack cluster
	//public static ItemStack cluster
	//public static ItemStack cluster
	//public static ItemStack cluster
	//public static ItemStack cluster
	//public static ItemStack cluster
	//public static ItemStack cluster
	//public static ItemStack cluster
	//public static ItemStack cluster
	//public static ItemStack cluster
	//public static ItemStack cluster
	//public static ItemStack cluster
	//public static ItemStack cluster
	//public static ItemStack cluster
	//public static ItemStack cluster
	//public static ItemStack cluster
	//public static ItemStack cluster
	//public static ItemStack cluster
	//public static ItemStack cluster
	//public static ItemStack cluster
	//public static ItemStack cluster
	//public static ItemStack cluster
	//public static ItemStack cluster
	//public static ItemStack cluster
	//public static ItemStack cluster
	//public static ItemStack cluster
	//public static ItemStack cluster
	//public static ItemStack cluster
	//public static ItemStack cluster












	//071000-07199 SLAGS
	public static ItemStack carbonSlag;							//07100
	public static ItemStack ceramicSlag;						//07101
	public static ItemStack thaumicSlag;						//07102
	public static ItemStack fluonicSlag;						//07103


	//09000-09199 OTHER INGOTS

	//09200-09399 OTHER NUGGETS

	//09400-09599 OTHER DUST
	public static ItemStack dustAer;							//09400
	public static ItemStack dustIgnis;							//09401
	public static ItemStack dustAqua;							//09402
	public static ItemStack dustTerra;							//09403
	public static ItemStack dustOrdo;							//09404
	public static ItemStack dustPerditio;						//09405
	public static ItemStack dustIron;							//09406
	public static ItemStack dustGold;							//09407
	public static ItemStack dustThaumium;						//09408
	public static ItemStack dustVoidmetal;						//09409
	public static ItemStack dustSulfur;							//09410
	public static ItemStack dustSaltpeter;						//09411
	//Salis Mundus
	public static ItemStack dustPrimalEssence;					//09413

	public static ItemStack dustWardenicBinder;					//09440

	public static ItemStack dustRedstoneReduced;				//09460
	public static ItemStack dustRedstonePurified;				//09461
	public static ItemStack dustRedstoneEnriched;				//09462
	public static ItemStack dustContainmentGlass;				//09463
	public static ItemStack dustTreatingCompound;				//09464
	public static ItemStack dustPiezomagneticCompound;			//09465
	public static ItemStack dustGeomagneticCompound;			//09466
	public static ItemStack dustConversionCompound;				//09467
	public static ItemStack dustContainmentCompound;			//09468

	//09600-09799 OTHER TINY DUST
	public static ItemStack tinyAer;							//09600
	public static ItemStack tinyIgnis;							//09601
	public static ItemStack tinyAqua;							//09602
	public static ItemStack tinyTerra;							//09603
	public static ItemStack tinyOrdo;							//09604
	public static ItemStack tinyPerditio;						//09605
	public static ItemStack tinyIron;							//09606
	public static ItemStack tinyGold;							//09607
	public static ItemStack tinyThaumium;						//09608
	public static ItemStack tinyVoidmetal;						//09609
	public static ItemStack tinySulfur;							//09610
	public static ItemStack tinySaltpeter;						//09611
	public static ItemStack tinySalisMundus;					//09612
	public static ItemStack tinyPrimalEssence;					//09613
	public static ItemStack tinyRedstone;						//09614

	public static ItemStack tinyWardenicCompound;				//09640

	public static ItemStack tinyRedstoneReduced;				//09660
	public static ItemStack tinyRedstonePurified;				//09661
	public static ItemStack tinyRedstoneEnriched;				//09662
	public static ItemStack tinyContainmentGlass;				//09663
	public static ItemStack tinyTreatingCompound;				//09664
	public static ItemStack tinyPiezomagneticCompound;			//09665
	public static ItemStack tinyGeomagneticCompound;			//09666
	public static ItemStack tinyConversionCompound;				//09667
	public static ItemStack tinyContainmentCompound;			//09668

	//public static ItemStack wardenJournal1;					//10001 //TODO: Wardenic Backstory

	//12000-19999 INTERMOD ITEMS
	//20000-29999 TINKER'S CONSTRUCT TOOL PARTS

	//30000+ TEMPORARY ITEMS
	public static ItemStack aluDenseTemp;						//30000


	/** ARMORS **/
	//public static ItemArmorInfusable cottonCap;
	//public static ItemArmorInfusable cottonTunic;
	//public static ItemArmorInfusable cottonPants;
	//public static ItemArmorInfusable cottonBoots;

	//public static ItemArmorInfusable woolCap;
	//public static ItemArmorInfusable woolTunic;
	//public static ItemArmorInfusable woolKilt;
	//public static ItemArmorInfusable woolShoes;

	public static ItemArmorInfusable bronzeChainHelmet;
	public static ItemArmorInfusable bronzeChainmail;
	public static ItemArmorInfusable bronzeChainGreaves;
	public static ItemArmorInfusable bronzeChainBoots;

	public static ItemArmorInfusable enchCottonGoggles;
	public static ItemArmorInfusable enchCottonRobe;
	public static ItemArmorInfusable enchCottonPants;
	public static ItemArmorInfusable enchCottonBoots;

	public static ItemArmorInfusable primalGoggles;
	public static ItemArmorInfusable primalRobe;
	public static ItemArmorInfusable primalPants;
	public static ItemArmorInfusable primalBoots;

	public static ItemArmorInfusable wardenclothSkullcap;
	public static ItemArmorInfusable wardenclothTunic;
	public static ItemArmorInfusable wardenclothPants;
	public static ItemArmorInfusable wardenclothBoots;

	public static ItemArmorInfusable wardenicChainCoif;
	public static ItemArmorInfusable wardenicChainmail;
	public static ItemArmorInfusable wardenicChainGreaves;
	public static ItemArmorInfusable wardenicChainBoots;

	public static ItemArmorInfusable wardenicPlateHelmet;
	public static ItemArmorInfusable wardenicChestplate;
	public static ItemArmorInfusable wardenicPlateGreaves;
	public static ItemArmorInfusable wardenicPlateBoots;

	public static ItemArmorInfusable wardenicCompositeHelmet;
	public static ItemArmorInfusable wardenicCompositeChestplate;
	public static ItemArmorInfusable wardenicCompositeGreaves;
	public static ItemArmorInfusable wardenicCompositeBoots;

	//public static ItemArmorInfusable wardenicSilverclothHood;
	//public static ItemArmorInfusable wardenicSilverclothRobe;
	//public static ItemArmorInfusable wardenicSilverclothLeggings;
	//public static ItemArmorInfusable wardenicSilverclothBoots;

	public static ItemArmorInfusable wardenicAwakenedHelmet;
	public static ItemArmorInfusable wardenicAwakenedChestplate;
	public static ItemArmorInfusable wardenicAwakenedGreaves;
	public static ItemArmorInfusable wardenicAwakenedBoots;

	public static ItemArmorInfusable fluxRobeGoggles;
	public static ItemArmorInfusable fluxRobeVest;
	public static ItemArmorInfusable fluxRobePants;
	public static ItemArmorInfusable fluxRobeBoots;

	//public static ItemArmorInfusable arcaneMechanicGoggles;
	//public static ItemArmorInfusable arcaneMechanicJacket;
	//public static ItemArmorInfusable arcaneMechanicPants;
	//public static ItemArmorInfusable arcaneMechanicBoots;

	//public static ItemArmorInfusable thaumicEngineerGoggles;
	//public static ItemArmorInfusable thaumicEngineerJacket;
	//public static ItemArmorInfusable thaumicEngineerPants;
	//public static ItemArmorInfusable thaumicEngineerBoots;

	//public static ItemArmorInfusable magneoturgeGoggles;
	//public static ItemArmorInfusable magneoturgeWaistcoat;
	//public static ItemArmorInfusable magneoturgeTrousers;
	//public static ItemArmorInfusable magneoturgeBoots;

	//public static ItemArmorInfusable artificerBrigandineHood;
	//public static ItemArmorInfusable artificerBrigandineBattlecoat;
	//public static ItemArmorInfusable artificerBrigandinePants;
	//public static ItemArmorInfusable artificerBrigandineBoots;

	//public static ItemArmorInfusable magneoturgeResonantGoggles;
	//public static ItemArmorInfusable magneoturgeResonantBattlecoat;
	//public static ItemArmorInfusable magneoturgeResonantPants;
	//public static ItemArmorInfusable magneoturgeResonantBoots;

	//public static ItemArmorInfusable occultistHood;
	//public static ItemArmorInfusable occultistRobe;
	//public static ItemArmorInfusable occultistLeggings;
	//public static ItemArmorInfusable occultistBoots;

	//public static ItemArmorInfusable occultistGildedHood;
	//public static ItemArmorInfusable occultistGildedRobe;
	//public static ItemArmorInfusable occultistGildedLeggings;
	//public static ItemArmorInfusable occultistGildedBoots;

	//public static ItemArmorInfusable eldritchPlateHelmet;
	//public static ItemArmorInfusable eldritchPlateChestplate;
	//public static ItemArmorInfusable eldritchPlateGreaves;
	//public static ItemArmorInfusable eldritchPlateBoots;

	//public static ItemArmorInfusable occultistInfusedHood;
	//public static ItemArmorInfusable occultistInfusedRobe;
	//public static ItemArmorInfusable occultistInfusedLeggings;
	//public static ItemArmorInfusable occultistInfusedBoots;

	//public static ItemArmorInfusable voidknightHelmet;
	//public static ItemArmorInfusable voidknightChestplate;
	//public static ItemArmorInfusable voidknightGreaves;
	//public static ItemArmorInfusable voidknightBoots;

	//public static ItemArmorInfusable occultistNebulousHood;
	//public static ItemArmorInfusable occultistNebulousRobe;
	//public static ItemArmorInfusable occultistNebulousLeggings;
	//public static ItemArmorInfusable occultistNebulousBoots;


	/** TOOLS **/
	//public static ItemSickleInfusable sickleThaumium;
	//public static ItemShearsInfusable shearsThaumium;
	//public static ItemFishingRodInfusable fishingRodThaumium;
	//public static ItemBowInfusable bowThaumium;
	//public static ItemHammerInfusable hammerThaumium;
	//public static ItemCrookInfusable crookThaumium;

	//public static ItemSickleInfusable sickleElemental;
	//public static ItemShearsInfusable shearsElemental;
	//public static ItemFishingRodInfusable fishingRodElemental;
	//public static ItemBowInfusable bowElemental;
	//public static ItemHammerInfusable hammerElemental;
	//public static ItemCrookInfusable crookElemental;

	//public static ItemSickleInfusable sickleVoid;
	//public static ItemShearsInfusable shearsVoid;
	//public static ItemFishingRodInfusable fishingRodVoid;
	//public static ItemBowInfusable bowVoid;
	//public static ItemHammerInfusable hammerVoid;
	//public static ItemCrookInfusable crookVoid;

	//public static ItemPickaxeInfusable pickaxeThaumicBronze;
	//public static ItemAxeInfusable axeThaumicBronze;
	//public static ItemShovelInfusable shovelThaumicBronze;
	//public static ItemHoeInfusable hoeThaumicBronze;
	//public static ItemSickleInfusable sickleThaumicBronze;
	//public static ItemShearsInfusable shearsThaumicBronze;
	//public static ItemFishingRodInfusable fishingRodThaumicBronze;
	//public static ItemSwordInfusable swordThaumicBronze;
	//public static ItemBowInfusable bowThaumicBronze;
	//public static ItemHammerInfusable hammerThaumicBronze;
	//public static ItemCrookInfusable crookThaumicBronze;

	//public static ItemPickaxeInfusable pickaxeWardenicGreatwood;
	//public static ItemAxeInfusable axeWardenicGreatwood;
	//public static ItemShovelInfusable shovelWardenicGreatwood;
	//public static ItemHoeInfusable hoeWardenicGreatwood;
	//public static ItemSickleInfusable sickleWardenicGreatwood;
	//public static ItemFishingRodInfusable fishingRodWardenicGreatwood;
	//public static ItemSwordInfusable swordWardenicGreatwood;
	//public static ItemBowInfusable bowWardenicGreatwood;
	//public static ItemHammerInfusable hammerWardenicGreatwood;
	//public static ItemCrookInfusable crookWardenicGreatwood;

	//public static ItemPickaxeInfusable pickaxeWardenicBronze;
	//public static ItemAxeInfusable axeWardenicBronze;
	//public static ItemShovelInfusable shovelWardenicBronze;
	//public static ItemHoeInfusable hoeWardenicBronze;
	//public static ItemSickleInfusable sickleWardenicBronze;
	//public static ItemShearsInfusable shearsWardenicBronze;
	//public static ItemFishingRodInfusable fishingRodWardenicBronze;
	//public static ItemSwordInfusable swordWardenicBronze;
	//public static ItemBowInfusable bowWardenicBronze;
	//public static ItemHammerInfusable hammerWardenicBronze;
	//public static ItemCrookInfusable crookWardenicBronze;

	//public static ItemPickaxeInfusable pickaxeWardenicSteel;
	//public static ItemAxeInfusable axeWardenicSteel;
	//public static ItemShovelInfusable shovelWardenicSteel;
	//public static ItemHoeInfusable hoeWardenicSteel;
	//public static ItemSickleInfusable sickleWardenicSteel;
	//public static ItemShearsInfusable shearsWardenicSteel;
	//public static ItemFishingRodInfusable fishingRodWardenicSteel;
	//public static ItemSwordInfusable swordWardenicSteel;
	//public static ItemBowInfusable bowWardenicSteel;
	//public static ItemHammerInfusable hammerWardenicSteel;
	//public static ItemCrookInfusable crookWardenicSteel;

	//public static ItemPickaxeInfusable pickaxeWardenicComposite;
	//public static ItemAxeInfusable axeWardenicComposite;
	//public static ItemShovelInfusable shovelWardenicComposite;
	//public static ItemHoeInfusable hoeWardenicComposite;
	//public static ItemSickleInfusable sickleWardenicComposite;
	//public static ItemShearsInfusable shearsWardenicComposite;
	//public static ItemFishingRodInfusable fishingRodWardenicComposite;
	//public static ItemSwordInfusable swordWardenicComposite;
	//public static ItemCrossbowInfusable crossbowWardenicComposite;
	//public static ItemHammerInfusable hammerWardenicComposite;
	//public static ItemCrookInfusable crookWardenicComposite;

	//public static ItemPickaxeInfusable pickaxeWardenicAwakened;
	//public static ItemAxeInfusable axeWardenicAwakened;
	//public static ItemShovelInfusable shovelWardenicAwakened;
	//public static ItemHoeInfusable hoeWardenicAwakened;
	//public static ItemSickleInfusable sickleWardenicAwakened;
	//public static ItemShearsInfusable shearsWardenicAwakened;
	//public static ItemFishingRodInfusable fishingRodWardenicAwakened;
	//public static ItemSwordInfusable swordWardenicAwakened;
	//public static ItemCrossbowInfusable crossbowWardenicAwakened;
	//public static ItemHammerInfusable hammerWardenicAwakened;
	//public static ItemCrookInfusable crookWardenicAwakened;

	//public static ItemPickaxeInfusable pickaxeRedsolder;
	//public static ItemAxeInfusable axeRedsolder;
	//public static ItemShovelInfusable shovelRedsolder;
	//public static ItemHoeInfusable hoeRedsolder;
	//public static ItemSickleInfusable sickleRedsolder;
	//public static ItemShearsInfusable shearsRedsolder;
	//public static ItemFishingRodInfusable fishingRodRedsolder;
	//public static ItemSwordInfusable swordRedsolder;
	//public static ItemBowInfusable bowRedsolder;
	//public static ItemHammerInfusable hammerRedsolder;
	//public static ItemCrookInfusable crookRedsolder;

	//public static ItemPickaxeInfusable pickaxeRedbronze;
	//public static ItemAxeInfusable axeRedbronze;
	//public static ItemShovelInfusable shovelRedbronze;
	//public static ItemHoeInfusable hoeRedbronze;
	//public static ItemSickleInfusable sickleRedbronze;
	//public static ItemShearsInfusable shearsRedbronze;
	//public static ItemFishingRodInfusable fishingRodRedbronze;
	//public static ItemSwordInfusable swordRedbronze;
	//public static ItemBowInfusable bowRedbronze;
	//public static ItemHammerInfusable hammerRedbronze;
	//public static ItemCrookInfusable crookRedbronze;

	//public static ItemPickaxeInfusable pickaxeFluxsteel;
	//public static ItemAxeInfusable axeFluxsteel;
	//public static ItemShovelInfusable shovelFluxsteel;
	//public static ItemHoeInfusable hoeFluxsteel;
	//public static ItemSickleInfusable sickleFluxsteel;
	//public static ItemShearsInfusable shearsFluxsteel;
	//public static ItemFishingRodInfusable fishingRodFluxsteel;
	//public static ItemSwordInfusable swordFluxsteel;
	//public static ItemCrossbowInfusable crossbowFluxsteel;
	//public static ItemHammerInfusable hammerFluxsteel;
	//public static ItemCrookInfusable crookFluxsteel;

	//public static ItemPickaxeInfusable pickaxeFluxedComposite;
	//public static ItemAxeInfusable axeFluxedComposite;
	//public static ItemShovelInfusable shovelFluxedComposite;
	//public static ItemHoeInfusable hoeFluxedComposite;
	//public static ItemSickleInfusable sickleFluxedComposite;
	//public static ItemShearsInfusable shearsFluxedComposite;
	//public static ItemFishingRodInfusable fishingRodFluxedComposite;
	//public static ItemSwordInfusable swordFluxedComposite;
	//public static ItemCrossbowInfusable crossbowFluxedComposite;
	//public static ItemHammerInfusable hammerFluxedComposite;
	//public static ItemCrookInfusable crookFluxedComposite;

	//public static ItemPickaxeInfusable pickaxeResonantComposite;
	//public static ItemAxeInfusable axeResonantComposite;
	//public static ItemShovelInfusable shovelResonantComposite;
	//public static ItemHoeInfusable hoeResonantComposite;
	//public static ItemSickleInfusable sickleResonantComposite;
	//public static ItemShearsInfusable shearsResonantComposite;
	//public static ItemFishingRodInfusable fishingRodResonantComposite;
	//public static ItemSwordInfusable swordResonantComposite;
	//public static ItemCrossbowInfusable crossbowResonantComposite;
	//public static ItemHammerInfusable hammerResonantComposite;
	//public static ItemCrookInfusable crookResonantComposite;

	//public static ItemPickaxeInfusable pickaxeCorruptedGreatwood;
	//public static ItemAxeInfusable axeCorruptedGreatwood;
	//public static ItemShovelInfusable shovelCorruptedGreatwood;
	//public static ItemHoeInfusable hoeCorruptedGreatwood;
	//public static ItemSickleInfusable sickleCorruptedGreatwood;
	//public static ItemFishingRodInfusable fishingRodCorruptedGreatwood;
	//public static ItemSwordInfusable swordCorruptedGreatwood;
	//public static ItemBowInfusable bowCorruptedGreatwood;
	//public static ItemHammerInfusable hammerCorruptedGreatwood;
	//public static ItemCrookInfusable crookCorruptedGreatwood;

	//public static ItemPickaxeInfusable pickaxeVoidbrass;
	//public static ItemAxeInfusable axeVoidbrass;
	//public static ItemShovelInfusable shovelVoidbrass;
	//public static ItemHoeInfusable hoeVoidbrass;
	//public static ItemSickleInfusable sickleVoidbrass;
	//public static ItemShearsInfusable shearsVoidbrass;
	//public static ItemFishingRodInfusable fishingRodVoidbrass;
	//public static ItemSwordInfusable swordVoidbrass;
	//public static ItemBowInfusable bowVoidbrass;
	//public static ItemHammerInfusable hammerVoidbrass;
	//public static ItemCrookInfusable crookVoidbrass;

	//public static ItemPickaxeInfusable pickaxeCrimsonThaumium;
	//public static ItemAxeInfusable axeCrimsonThaumium;
	//public static ItemShovelInfusable shovelCrimsonThaumium;
	//public static ItemHoeInfusable hoeCrimsonThaumium;
	//public static ItemSickleInfusable sickleCrimsonThaumium;
	//public static ItemShearsInfusable shearsCrimsonThaumium;
	//public static ItemFishingRodInfusable fishingRodCrimsonThaumium;
	//public static ItemSwordInfusable swordCrimsonThaumium;
	//public static ItemBowInfusable bowCrimsonThaumium;
	//public static ItemHammerInfusable hammerCrimsonThaumium;
	//public static ItemCrookInfusable crookCrimsonThaumium;

	//public static ItemPickaxeInfusable pickaxeVoidtungsten;
	//public static ItemAxeInfusable axeVoidtungsten;
	//public static ItemShovelInfusable shovelVoidtungsten;
	//public static ItemHoeInfusable hoeVoidtungsten;
	//public static ItemSickleInfusable sickleVoidtungsten;
	//public static ItemShearsInfusable shearsVoidtungsten;
	//public static ItemFishingRodInfusable fishingRodVoidtungsten;
	//public static ItemSwordInfusable swordVoidtungsten;
	//public static ItemBowInfusable bowVoidtungsten;
	//public static ItemHammerInfusable hammerVoidtungsten;
	//public static ItemCrookInfusable crookVoidtungsten;

	//public static ItemPickaxeInfusable pickaxeNebulousVoidtungsten;
	//public static ItemAxeInfusable axeNebulousVoidtungsten;
	//public static ItemShovelInfusable shovelNebulousVoidtungsten;
	//public static ItemHoeInfusable hoeNebulousVoidtungsten;
	//public static ItemSickleInfusable sickleNebulousVoidtungsten;
	//public static ItemShearsInfusable shearsNebulousVoidtungsten;
	//public static ItemFishingRodInfusable fishingRodNebulousVoidtungsten;
	//public static ItemSwordInfusable swordNebulousVoidtungsten;
	//public static ItemBowInfusable bowNebulousVoidtungsten;
	//public static ItemHammerInfusable hammerNebulousVoidtungsten;
	//public static ItemCrookInfusable crookNebulousVoidtungsten;



	/*
	public static ItemPickaxeInfusable pickaxe
	public static ItemAxeInfusable axe
	public static ItemShovelInfusable shovel
	public static ItemHoeInfusable hoe
	public static ItemSickleInfusable sickle
	public static ItemShearsInfusable shears
	public static ItemFishingRodInfusable fishingRod
	public static ItemSwordInfusable sword
	public static ItemBowInfusable bow
	public static ItemHammerInfusable hammer
	public static ItemCrookInfusable crook
	*/

	/** OTHER EQUIPMENT **/
	public static ItemFocusBasic focusPurity;
	public static ItemFocusBasic focusIllumination;

	//public static Item itemThreadSpool;

	//public static ItemSocketingHammer socketingHammer;
	//public static ItemWeslyHammer weslyHammer;
	//public static ItemFluxWardenKukri kukriFluxWarden;

	//public static ItemThaumicCodex itewThaumicCodex;

	/** OTHER EQUIPMENT STACKS **/
	public static ItemStack amuletWarden;						//00000
	public static ItemStack ringLove;							//00001
	public static ItemStack pendantPrimal;						//00002

	//public static ItemStack capacitorRedsolder;					//00000
	//public static ItemStack capacitorMultiLayer;				//00001
	//public static ItemStack capacitorElectrum;					//00002
	//public static ItemStack capacitorHighResonance;				//00003
	//public static ItemStack capacitorPiezomagnetic;				//00004
	//public static ItemStack capacitorMagneoturgic;				//00005
	//public static ItemStack capacitorUltraHighResonance;		//00006

	//public static ItemStack codexThaumic;						//00000
	//public static ItemStack codexMagneoturgic;				//00001

	/** RECIPES **/
	public static ShapelessOreRecipe recipeCuZn;
	public static ShapelessOreRecipe recipeCuSn;
	public static ShapelessOreRecipe recipeCuAs;
	public static ShapelessOreRecipe recipeCuSb;
	public static ShapelessOreRecipe[] recipeCuZnBi;
	public static ShapelessOreRecipe recipeCuAsSb;
	public static ShapelessOreRecipe recipeCuAl;
	public static ShapelessOreRecipe recipeCuNi;
	public static ShapelessOreRecipe recipeRBrz;
	public static ShapelessOreRecipe recipeCnst;
	public static ShapelessOreRecipe recipeFeNi;
	public static ShapelessOreRecipe recipeAuAg;
	public static ShapelessOreRecipe[] recipeDullRedsolder;
	public static ShapelessOreRecipe recipeRedsolder;

	public static ShapelessOreRecipe recDustCuZn;
	public static ShapelessOreRecipe recDustCuSn;
	public static ShapelessOreRecipe recDustCuAs;
	public static ShapelessOreRecipe recDustCuSb;
	public static ShapelessOreRecipe[] recDustCuZnBi;
	public static ShapelessOreRecipe recDustCuAsSb;
	public static ShapelessOreRecipe recDustCuAl;
	public static ShapelessOreRecipe recDustCuNi;
	public static ShapelessOreRecipe recDustRBrz;
	public static ShapelessOreRecipe recDustCnst;
	public static ShapelessOreRecipe recDustFeNi;
	public static ShapelessOreRecipe recDustAuAg;
	public static ShapelessOreRecipe recDustRedsolder;

	//public static ShapelessOreRecipe recipeOsLu;
	//public static ShapelessOreRecipe recCoatOsLu;

	/*public static ShapelessOreRecipe recTinyBrass;
	public static ShapelessOreRecipe recTinyBronze;
	public static ShapelessOreRecipe recTinyMithril;
	public static ShapelessOreRecipe recTinyRiftishBronze;
	public static ShapelessOreRecipe recTinyElectrum;
	public static ShapelessOreRecipe recTinyOsLu;*/

	public static ShapedOreRecipe recipeGreatwoodShaft;
	public static ShapelessOreRecipe recipeSalisTiny;
	public static ShapelessOreRecipe recipeSalis;

	/*public static ShapedOreRecipe recipeWardsidianSlab;
	public static ShapedOreRecipe recipeEldritchSlab;
	public static ShapelessOreRecipe recipeWardsidianDeslab;
	public static ShapelessOreRecipe recipeEldritchDeslab;*/

	public static ShapedOreRecipe recipeQuartzBlock;
	/*public static ShapedOreRecipe recipeQuartzChiseled;
	public static ShapedOreRecipe recipeQuartzPillar;
	public static ShapedOreRecipe recipeQuartzSlab;
	public static ShapedOreRecipe recipeQuartzStair;*/
	public static ShapelessOreRecipe recipeQuartzDeblock;
	/*public static ShapelessOreRecipe recipeQuartzDeslab;
	public static ShapelessOreRecipe recipeQuartzDestair;
	public static ShapelessOreRecipe recipeQuartzResetChiseled;
	public static ShapelessOreRecipe recipeQuartzResetPillar;*/

	public static ShapelessOreRecipe recipeCottonFiber;
	public static ShapelessOreRecipe recipeCottonFabric;
	public static ShapedArcaneRecipe recipeTreatedCotton;
	public static CrucibleRecipe recipeEnchantedCotton;

	public static ShapedArcaneRecipe recipeEnchCottonGoggles;
	public static ShapedArcaneRecipe recipeEnchCottonRobes;
	public static ShapedArcaneRecipe recipeEnchCottonPants;
	public static ShapedArcaneRecipe recipeEnchCottonBoots;

	public static ShapedArcaneRecipe recipeOrbReceptorBasic;

	public static InfusionRecipe recipePrimalGoggles;
	public static InfusionRecipe recipePrimalRobes;
	public static InfusionRecipe recipePrimalPants;
	public static InfusionRecipe recipePrimalBoots;

	public static InfusionRecipe recipePrimalPendant;

	public static ShapedArcaneRecipe recipeAniPiston;

	public static ShapelessArcaneRecipe recipeThaumicBronzeRaw;
	public static ShapelessArcaneRecipe recipeThaumicBronzeCoated;

	public static InfusionRecipe recipeThaumicSteel;
	public static InfusionRecipe recipeBlockThaumicSteel;
	public static InfusionRecipe recipeThaumicRBronze;
	public static CrucibleRecipe recipeThaumicElectrum;

	public static ShapedArcaneRecipe recipeThaumicBronzeChain;

	public static ShapedArcaneRecipe recipeBronzeChainHelmet;
	public static ShapedArcaneRecipe recipeBronzeChainmail;
	public static ShapedArcaneRecipe recipeBronzeChainGreaves;
	public static ShapedArcaneRecipe recipeBronzeChainBoots;

	//public static ShapedArcaneRecipe recipeRunicInfuser;
	public static /*RunicInfuserRecipe*/ ShapelessArcaneRecipe recipeArcaneSingularity;

	public static /*RunicInfuserRecipe*/ ShapelessArcaneRecipe recipeStableSingularity;

	public static InfusionRecipe recipePrimalEssence;

	public static /*RunicInfuserRecipe*/ ShapelessArcaneRecipe recipeEnchGreatwood;
	public static ShapedArcaneRecipe recipeEnchGreatwoodShaft;

	public static /*RunicInfuserRecipe*/ ShapelessArcaneRecipe recipeEnchSilverwood;
	public static ShapedArcaneRecipe recipeEnchSilverwoodShaft;

	public static /*DarkRunicInfuserRecipe*/ ShapelessArcaneRecipe recipeVoidbrass;

	public static /*RunicInfuserRecipe*/ InfusionRecipe recipeConsSilverwood;
	public static ShapedArcaneRecipe recipeConsSilverwoodShaft;

	public static ShapedArcaneRecipe recipeEldritchStone;

	public static ShapedArcaneRecipe recipeEldritchCog;
	public static ShapedArcaneRecipe recipeEldritchKeystone;

	//public static ShapedArcaneRecipe recipeDarkRunicInfuser;

	//public static InfusionRecipe recipeAlchemicalInfuser;

	//public static InfusionRecipe recipeDarkAlchemicalInfuser;

	public static ShapelessOreRecipe[] recipesPods;
	public static CrucibleRecipe recipePowderCinderpearl;
	public static CrucibleRecipe recipePowderShiverpearl;
	public static CrucibleRecipe recipePowderStormypearl;
	public static CrucibleRecipe recipePowderStonypearl;

	public static CrucibleRecipe recipeTransNickel;
	public static CrucibleRecipe recipeTransAluminium;
	public static CrucibleRecipe recipeTransNeodymium;
	public static CrucibleRecipe recipeTransZinc;
	public static CrucibleRecipe recipeTransArsenic;
	public static CrucibleRecipe recipeTransAntimony;
	public static CrucibleRecipe recipeTransBismuth;
	public static CrucibleRecipe recipeTransTungsten;
	public static CrucibleRecipe recipeTransLutetium;
	public static CrucibleRecipe recipeTransPalladium;
	public static CrucibleRecipe recipeTransPlatinum;
	public static CrucibleRecipe recipeTransOsmium;
	public static CrucibleRecipe recipeTransIridium;

	public static CrucibleRecipe recipeClusterNickel;
	public static CrucibleRecipe recipeClusterAluminium;
	public static CrucibleRecipe recipeClusterXenotime;

	public static CrucibleRecipe recipeClusterZinc;

	public static CrucibleRecipe recipeClusterBismuth;
	public static CrucibleRecipe recipeClusterTennantite;
	public static CrucibleRecipe recipeClusterTertahedrite;
	public static CrucibleRecipe recipeClusterPlatinum;
	public static CrucibleRecipe recipeClusterTungsten;
	public static CrucibleRecipe recipeClusterIridosmium;

	public static InfusionRecipe recipeWardenicHardener;
	public static InfusionRecipe recipeWardenicHardenerAlt;

	public static ShapelessArcaneRecipe recipeExcubituraPaste;

	public static ShapedArcaneRecipe recipeExcubituraFabric;
	public static CrucibleRecipe recipeWardencloth;

	public static ShapedArcaneRecipe recipeWardenclothSkullcap;
	public static ShapedArcaneRecipe recipeWardenclothTunic;
	public static ShapedArcaneRecipe recipeWardenclothPants;
	public static ShapedArcaneRecipe recipeWardenclothBoots;

	public static ShapelessArcaneRecipe recipeExcubituraOilUnproc;
	public static /*RunicInfuserRecipe*/ ShapelessArcaneRecipe recipeExcubituraOil;

	public static ShapedArcaneRecipe recipeWardenBronzeChain;
	public static ShapedArcaneRecipe recipePrimalBronzeChain;
	public static ShapedArcaneRecipe recipeWardenBronze;
	public static ShapedArcaneRecipe recipeWardenBronzePlate;

	public static ShapedArcaneRecipe recipeWardenicChainHelmet;
	public static ShapedArcaneRecipe recipeWardenicChainmail;
	public static ShapedArcaneRecipe recipeWardenicChainGreaves;
	public static ShapedArcaneRecipe recipeWardenicChainBoots;

	public static /*RunicInfuserRecipe*/ ShapelessArcaneRecipe recipePureOil;

	public static InfusionRecipe recipeWardenSteel;

	public static ShapedArcaneRecipe recipeWardenSteelChain;
	public static ShapedArcaneRecipe recipeWardenSteelChainOiled;
	public static /*ThaumicHammermillRecipe*/ ShapedArcaneRecipe recipeWardenSteelPlate;
	public static ShapedArcaneRecipe recipeDetailedSteelPlate;
	public static /*AlchemicalInfuserRecipe*/ InfusionRecipe recipeRunicSteelPlate;
	public static /*RunicInfuserRecipe*/ InfusionRecipe recipesConsecratedSteelPlate;

	public static ShapedArcaneRecipe recipeWardenicPlateHelmet;
	public static ShapedArcaneRecipe recipeWardenicChestplate;
	public static ShapedArcaneRecipe recipeWardenicPlateGreaves;
	public static ShapedArcaneRecipe recipeWardenicPlateBoots;

	public static CrucibleRecipe recipeWardenicQuartz;
	public static CrucibleRecipe recipeWardenicQuartzDust;
	public static CrucibleRecipe recipeWardenicQuartzReconst;
	public static InfusionRecipe recipeWardenicQuartzInf;

	public static CrucibleRecipe recipeWardenicCrystal;
	public static CrucibleRecipe recipeWardenicCrystalDust;
	public static CrucibleRecipe recipeWardenicCrystalReconst;
	public static InfusionRecipe recipeWardenicBinder;
	public static ShapelessOreRecipe recipeBinderTiny;
	public static ShapelessOreRecipe recipeBinderCombine;
	public static InfusionRecipe recipeActivatedWardenicCrystal;

	public static InfusionRecipe recipeWardenRBronze;

	public static ShapelessOreRecipe[] recipeWardenMetal;
	public static ShapedArcaneRecipe recipeWardenicCompositeRaw;
	public static InfusionRecipe recipeWardenicCompositeIngot;

	public static ShapelessOreRecipe recipeAluDenseTemp;    //TODO: Add Thaumic Hammermill
	public static /*ThaumicCompressorRecipe*/ ShapedArcaneRecipe recipeWardenicCompositePlate;

	public static /*ThaumicCompressorRecipe*/ ShapedArcaneRecipe recipeFittedCompositePlate;
	public static ShapedArcaneRecipe recipeDetailedCompositePlate;
	public static /*AlchemicalInfuserRecipe*/ InfusionRecipe recipeRunicCompositePlate;
	public static InfusionRecipe recipeConsecratedCompositePlate;
	public static InfusionRecipe recipePrimalCompositePlate;

	public static ShapedArcaneRecipe recipeWardenicCompositeHelmet;
	public static ShapedArcaneRecipe recipeWardenicCompositeChestplate;
	public static ShapedArcaneRecipe recipeWardenicCompositeGreaves;
	public static ShapedArcaneRecipe recipeWardenicCompositeBoots;

	public static InfusionRecipe recipeWardenicCrystalAwakened;
	public static InfusionRecipe recipeWardenicEssenceAwakened;

	public static CrucibleRecipe recipeRedstoneReduced;
	public static ShapelessArcaneRecipe[] recipeArcaneRedsolder;
	public static ShapedArcaneRecipe recipeCapCoreRedsolder;
	public static ShapelessArcaneRecipe recipeRedstoneFabric;
	public static CrucibleRecipe recipeRedcloth;
	public static ShapelessArcaneRecipe recipeRedclothCapacitive;

	public static ShapedArcaneRecipe recipeFluxRobesGoggles;
	public static ShapedArcaneRecipe recipeFluxRobesVest;
	public static ShapedArcaneRecipe recipeFluxRobesPants;
	public static ShapedArcaneRecipe recipeFluxRobesShoes;

	/** RESEARCH **/
	public static ResearchItem researchThaumRev;
	public static String keyThaumRev = "THAUMIC_REVELATIONS";

	public static ResearchItem researchWardenry;
	public static String keyWardenry = "THAUMIC_WARDEN";

	public static ResearchItem researchMagneoturgy;
	public static String keyMagneoturgy = "MAGNEOTURGY";

	//public static ResearchItem researchEldritch;
	//public static String keyEldritch = "ELDRITCH_WORKINGS";


	public static ResearchItem researchMaterial;
	public static String keyMaterial = "MATERIAL_TRv";

	public static ResearchItem researchMinerals;
	public static String keyMinerals = "MINERALS_TRv";

	public static ResearchItem researchAlloys;
	public static String keyAlloys = "ALLOYS_TRv";


	public static ResearchItem researchThaumicBronze;
	public static String keyThaumicBronze = "THAUMIC_BRONZE";

	public static ResearchItem researchBronzeChain;
	public static String keyBronzeChain = "TBRONZE_CHAIN";

	public static ResearchItem researchArmorBronzeChain;
	public static String keyArmorBronzeChain = "ARMOR_TBRONZE";

	public static ResearchItem researchThaumicRBronze;
	public static String keyThaumicRBronze = "THAUMIC_TINKERS_BRONZE";

	public static ResearchItem researchThaumicSteel;
	public static String keyThaumicSteel = "THAUMIC_STEEL";

	public static ResearchItem researchThaumicElectrum;
	public static String keyThaumicElectrum = "THAUMIC_ELECTRUM";

	public static ResearchItem researchCotton;
	public static String keyCotton = "ENCHCOTTON";

	public static ResearchItem researchCottonRobes;
	public static String keyCottonRobes = "COTTON_ROBES";

	public static ResearchItem researchPrimalRobes;
	public static String keyPrimalRobes = "ROBES_PRIMAL";

	public static ResearchItem researchPrimalPendant;
	public static String keyPrimalPendant = "PENDANT_PRIMAL";

	public static ResearchItem researchAspectOrbBasic;
	public static String keyAspectOrbBasic = "ASPECT_ORB_BASIC";

	//public static ResearchItem researchAspectOrbAdv;
	//public static String keyAspectOrbAdv = "ASPECT_ORB_ADV";


	public static ResearchItem researchRunicInfuser;
	public static String keyRunicInfuser = "RUNIC_INFUSER";

	public static ResearchItem researchStabilizedSingularity;
	public static String keyStabilizedSingularity = "STABLE_SINGULARITY";

	public static ResearchItem researchPrimalEssence;
	public static String keyPrimalEssence = "PRIMAL_ESSENCE";

	public static ResearchItem researchEnchGreatwood;
	public static String keyEnchGreatwood = "ENCH_GREATWOOD";

	public static ResearchItem researchAniPiston;
	public static String keyAniPiston = "ANIMATED_PISTON";

	public static ResearchItem researchEnchSilverwood;
	public static String keyEnchSilverwood = "ENCH_SILVERWOOD";

	public static ResearchItem researchConsSilverwood;
	public static String keyConsSilverwood = "CONS_SILVERWOOD";

	public static ResearchItem researchVoidbrass;
	public static String keyVoidbrass = "VOIDBRASS";


	public static ResearchItem researchEldritchStone;
	public static String keyEldritchStone = "ELDRITCH_STONE";

	public static ResearchItem researchVoidmetalWorking;
	public static String keyVoidmetalWorking = "VOIDMETAL_WORKING";


	public static ResearchItem researchElementalPowders;
	public static String keyElementalPowders = "ELEMENTAL_POWDERS";


	//public static ResearchItem researchThaumicHammermill;
	public static String keyThaumicHammermill = "WARDENIC_OBSIDIAN"; //"THAUMIC_HAMMERMILL";


	public static ResearchItem researchExcubituraPaste;
	public static String keyExcubituraPaste = "EXCUBITURA_PASTE";

	public static ResearchItem researchWardencloth;
	public static String keyWardencloth = "WARDENCLOTH";

	public static ResearchItem researchArmorWardencloth;
	public static String keyArmorWardencloth = "ARMOR_WARDENCLOTH";


	public static ResearchItem researchExcubituraOil;
	public static String keyExcubituraOil = "EXCUBITURA_OIL";

	public static ResearchItem researchWardenChain;
	public static String keyWardenChain = "WARDENCHAIN";

	public static ResearchItem researchArmorWardenChain;
	public static String keyArmorWardenChain = "ARMOR_WARDENCHAIN";


	public static ResearchItem researchPureOil;
	public static String keyPureOil = "PURE_OIL";

	public static ResearchItem researchWardenSteel;
	public static String keyWardenSteel = "WARDEN_STEEL";

	public static ResearchItem researchWardenPlate;
	public static String keyWardenPlate = "WARDEN_PLATE";

	public static ResearchItem researchArmorWardenSteel;
	public static String keyArmorWardenSteel = "ARMOR_WARDEN_STEEL";

	public static ResearchItem researchWardenicObsidian;
	public static String keyWardenicObsidian = "WARDENIC_OBSIDIAN";


	public static ResearchItem researchQuartz;
	public static String keyQuartz = "WARDEN_QUARTZ";

	public static ResearchItem researchWardenCrystal;
	public static String keyWardenCrystal = "WARDEN_CRYSTAL";

	public static ResearchItem researchWardenBronze;
	public static String keyWardenBronze = "WARDEN_BRONZE";

	public static ResearchItem researchWardenComposite;
	public static String keyWardenComposite = "WARDEN_COMPOSITE";

	public static ResearchItem researchWardenCompositePlate;
	public static String keyWardenCompositePlate = "WARDEN_COMPOSITE_PLATE";

	public static ResearchItem researchWardenCompositeFitting;
	public static String keyWardenCompositeFitting = "WARDEN_COMPOSITE_FITTING";

	public static ResearchItem researchArmorWardenComposite;
	public static String keyArmorWardenComposite = "ARMOR_WARDEN_COMPOSITE";


	public static ResearchItem researchWardenCrystalAwakened;
	public static String keyWardenCrystalAwakened = "WARDEN_CRYSTAL_AWAKENED";

	public static ResearchItem researchWardenEssenceAwakened;
	public static String keyWardenEssenceAwakened = "WARDEN_ESSENCE_AWAKENED";


	public static ResearchItem researchRedstoneReduced;
	public static String keyRedstoneReduced = "REDSTONE_REDUCED";

	public static ResearchItem researchArcaneRedsolder;
	public static String keyArcaneRedsolder = "ARCANE_REDSOLDER";

	public static ResearchItem researchCapCoreRedsolder;
	public static String keyCapCoreRedsolder = "CAPCORE_REDSOLDER";

	public static ResearchItem researchRedcloth;
	public static String keyRedcloth = "REDCLOTH";

	public static ResearchItem researchArmorFluxRobes;
	public static String keyArmorFluxRobes = "ARMOR_FLUXROBES";


	public static ResearchItem researchTransmutationFe;
	public static String keyTransmutationFe = "TRv_TRANSMUTATION_FE";

	public static ResearchItem researchTransmutationSn;
	public static String keyTransmutationSn = "TRv_TRANSMUTATION_SN";
	
	public static ResearchItem researchTransmutationAg;
	public static String keyTransmutationAg = "TRv_TRANSMUTATION_AG";

	public static ResearchItem researchTransmutationPb;
	public static String keyTransmutationPb = "TRv_TRANSMUTATION_PB";

	public static ResearchItem researchTransmutationAu;
	public static String keyTransmutationAu = "TRv_TRANSMUTATION_AU";

	public static ResearchItem researchTransmutationNi;
	public static String keyTransmutationNi = "TRv_TRANSMUTATION_NI";

	public static ResearchItem researchTransmutationAl;
	public static String keyTransmutationAl = "TRv_TRANSMUTATION_AL";

	public static ResearchItem researchTransmutationNd;
	public static String keyTransmutationNd = "TRv_TRANSMUTATION_ND";

	public static ResearchItem researchTransmutationZn;
	public static String keyTransmutationZn = "TRv_TRANSMUTATION_ZN";

	public static ResearchItem researchTransmutationAs;
	public static String keyTransmutationAs = "TRv_TRANSMUTATION_AS";

	public static ResearchItem researchTransmutationSb;
	public static String keyTransmutationSb = "TRv_TRANSMUTATION_SB";

	public static ResearchItem researchTransmutationBi;
	public static String keyTransmutationBi = "TRv_TRANSMUTATION_BI";

	public static ResearchItem researchTransmutationW;
	public static String keyTransmutationW = "TRv_TRANSMUTATION_W";

	public static ResearchItem researchTransmutationLu;
	public static String keyTransmutationLu = "TRv_TRANSMUTATION_LU";

	public static ResearchItem researchTransmutationPd;
	public static String keyTransmutationPd = "TRv_TRANSMUTATION_PD";

	public static ResearchItem researchTransmutationPt;
	public static String keyTransmutationPt = "TRv_TRANSMUTATION_PT";

	public static ResearchItem researchTransmutationOs;
	public static String keyTransmutationOs = "TRv_TRANSMUTATION_OS";

	public static ResearchItem researchTransmutationIr;
	public static String keyTransmutationIr = "TRv_TRANSMUTATION_IR";


	public static ResearchItem researchClusterFe;
	public static String keyClusterFe = "TRv_CLUSTER_FE";

	public static ResearchItem researchClusterCu;
	public static String keyClusterCu = "TRv_CLUSTER_CU";

	public static ResearchItem researchClusterSn;
	public static String keyClusterSn = "TRv_CLUSTER_SN";

	public static ResearchItem researchClusterPb;
	public static String keyClusterPb = "TRv_CLUSTER_PB";

	public static ResearchItem researchClusterAu;
	public static String keyClusterAu = "TRv_CLUSTER_AU";

	public static ResearchItem researchClusterNi;
	public static String keyClusterNi = "TRv_CLUSTER_NI";

	public static ResearchItem researchClusterAl;
	public static String keyClusterAl = "TRv_CLUSTER_AL";

	public static ResearchItem researchClusterYPO;
	public static String keyClusterYPO = "TRv_CLUSTER_YPO";

	public static ResearchItem researchClusterZn;
	public static String keyClusterZn = "TRv_CLUSTER_ZN";

	public static ResearchItem researchClusterBi;
	public static String keyClusterBi = "TRv_CLUSTER_BI";

	public static ResearchItem researchClusterCuAs;
	public static String keyClusterCuAs = "TRv_CLUSTER_CUAS";

	public static ResearchItem researchClusterCuSb;
	public static String keyClusterCuSb = "TRv_CLUSTER_CUSB";

	public static ResearchItem researchClusterPt;
	public static String keyClusterPt = "TRv_CLUSTER_PT";

	public static ResearchItem researchClusterW;
	public static String keyClusterW = "TRv_CLUSTER_W";

	public static ResearchItem researchClusterIrOs;
	public static String keyClusterIrOs = "TRv_CLUSTER_IROS";

	/** WORLD GENERATORS **/
	public static WorldGenPlant genExcubitura;
	public static WorldGenPlant genCotton;
	public static WorldGenPlant genThistle;
	public static WorldGenPlant genShiverpearl;
	public static WorldGenPlant genStormypearl;
	public static WorldGenPlant genStonypearl;
	public static WorldGenOreVein genChalcocite;
	public static WorldGenOreVein genSphalerite;
	public static WorldGenOreVein genCassiterite;
	public static WorldGenOreVein genMillerite;
	public static WorldGenOreVein genNativeSilver;
	public static WorldGenOreVein genGalena;
	public static WorldGenOreVein genXenotime;
	public static WorldGenOreVein genWolframite;
	public static WorldGenOreVein genIridosmium;
	public static WorldGenOreVein genBismuthinite;
	public static WorldGenOreVein genTennantite;
	public static WorldGenOreVein genTetrahedite;
	public static WorldGenOreVein genPyrope;
	public static WorldGenOreVein genDioptase;
	public static WorldGenOreVein genJethrineSapphire;
	public static WorldGenMixedOreVein genCopperMix;
	public static WorldGenMixedOreVein genAgPb;
	public static WorldGenMixedOreVein genWSn;
	public static WorldGenMixedOreVein genAgPbBi;
	public static PoorOreGenerator genPoorChalcocite;
	public static PoorOreGenerator genPoorSphalerite;
	public static PoorOreGenerator genPoorCassiterite;
	public static PoorOreGenerator genPoorMillerite;
	public static PoorOreGenerator genPoorNativeSilver;
	public static PoorOreGenerator genPoorGalena;
	public static PoorOreGenerator genPoorXenotime;
	public static PoorOreGenerator genPoorWolframite;
	public static PoorOreGenerator genPoorIridosmium;
	public static PoorOreGenerator genPoorBismuthinite;
	public static PoorOreGenerator genPoorTennantite;
	public static PoorOreGenerator genPoorTetrahedite;
	public static SurfaceOreGen genGravelChalcocite;
	public static SurfaceOreGen genGravelSphalerite;
	public static SurfaceOreGen genGravelCassiterite;
	public static SurfaceOreGen genGravelMillerite;
	public static SurfaceOreGen genGravelNativeSilver;
	public static SurfaceOreGen genGravelGalena;
	public static SurfaceOreGen genGravelXenotime;
	public static SurfaceOreGen genGravelWolframite;
	public static SurfaceOreGen genGravelIridosmium;
	public static SurfaceOreGen genGravelBismuthinite;
	public static SurfaceOreGen genGravelTennantite;
	public static SurfaceOreGen genGravelTetrahedite;

	public static EventType eventPoorChalcocite;
	public static EventType eventPoorSphalerite;
	public static EventType eventPoorCassiterite;
	public static EventType eventPoorMillerite;
	public static EventType eventPoorNativeSilver;
	public static EventType eventPoorGalena;
	public static EventType eventPoorXenotime;
	public static EventType eventPoorWolframite;
	public static EventType eventPoorIridosmium;
	public static EventType eventPoorBismuthinite;
	public static EventType eventPoorTennantite;
	public static EventType eventPoorTetrahedite;

	/** ARMOR MATERIALS **/
	public static ArmorMaterial matPrimal;
	public static ArmorMaterial matBronzeChain;
	public static ArmorMaterial matWardencloth;
	public static ArmorMaterial matWardenicChain;
	public static ArmorMaterial matWardenicSteel;
	public static ArmorMaterial matWardenicComposite;
	public static ArmorMaterial matWardenicAwakened;
	public static ArmorMaterial matFluxRobes;

	/** ARMOR DATA **/
	public static ArmorDataAdv dataEnchCottonGoggles;
	public static ArmorDataAdv dataEnchCottonRobe;
	public static ArmorDataAdv dataEnchCottonPants;
	public static ArmorDataAdv dataEnchCottonBoots;

	public static ArmorDataAdv dataBronzeChainCoif;
	public static ArmorDataAdv dataBronzeChainmail;
	public static ArmorDataAdv dataBronzeChainGreaves;
	public static ArmorDataAdv dataBronzeChainBoots;

	public static ArmorDataAdv dataPrimalGoggles;
	public static ArmorDataAdv dataPrimalRobe;
	public static ArmorDataAdv dataPrimalPants;
	public static ArmorDataAdv dataPrimalBoots;

	public static ArmorDataAdv dataWardenclothSkullcap;
    public static ArmorDataAdv dataWardenclothTunic;
    public static ArmorDataAdv dataWardenclothPants;
    public static ArmorDataAdv dataWardenclothBoots;

	public static ArmorDataAdv dataWardenicChainCoif;
	public static ArmorDataAdv dataWardenicChainmail;
	public static ArmorDataAdv dataWardenicChainGreaves;
	public static ArmorDataAdv dataWardenicChainBoots;
	
	public static ArmorDataAdv dataWardenicSteelHelmet;
	public static ArmorDataAdv dataWardenicSteelChestplate;
	public static ArmorDataAdv dataWardenicSteelGreaves;
	public static ArmorDataAdv dataWardenicSteelBoots;

	public static ArmorDataAdv dataWardenicCompositeHelmet;
	public static ArmorDataAdv dataWardenicCompositeChestplate;
	public static ArmorDataAdv dataWardenicCompositeGreaves;
	public static ArmorDataAdv dataWardenicCompositeBoots;

	public static ArmorDataAdv dataWardenicAwakenedHelmet;
	public static ArmorDataAdv dataWardenicAwakenedChestplate;
	public static ArmorDataAdv dataWardenicAwakenedGreaves;
	public static ArmorDataAdv dataWardenicAwakenedBoots;

	public static ArmorDataAdv dataFluxRobeGoggles;
	public static ArmorDataAdv dataFluxRobeRobe;
	public static ArmorDataAdv dataFluxRobePants;
	public static ArmorDataAdv dataFluxRobeBoots;
	

	/** BLOCK NAMES  **/
	public static final String[] NAMES_CROP_MUNDANE = { "cotton", "thistle" };

	//Will remove in favor of EnumMetal(Mineral?)Data in v0.0.2
	public static final String[] NAMES_STORAGE_ORE = { CU, ZN, SN, NI, AG, PB, LU, W, IR, BI, AS, SB, ND, OS, PD, AL };
	public static final String[] NAMES_STORAGE_ALLOY_1 = { CUZN, CUSN, CUAS, CUSB, CUBI, "Mithril", CUAL, CUNI, RBRZ, CNST, FENI, AUAG, WRDM, DRDS, RDSR };
	public static final String[] NAMES_STORAGE_SPECIAL = { TELC, TRBR, STEL, TSTL, VBRS, VSTL, VDWT, VCPN };
	public static final String[] NAMES_STORAGE_EQUIPMENT = { WBRZ, WDST, WRBR, WCMP, ARDS, RDBR, HRBR, FSTL, FLXW, MCMP, FCMP, RCMP, EVBS, CTHM, OCVW };
	public static final String[] NAMES_STORAGE_GEM_NAME = { PYRP, DIOP, JSPH, JPRT, WCRS, AWCR, WWCR, WQRZ, IQRZ, RQRZ};
	public static final String[] NAMES_STORAGE_GEM_ORE = { PYRP, DIOP, JSPH, JPRT, WCRS, AWCR, WWCR, WQRZ, IQRZ, RQZT};
	public static final String[] NAMES_STORAGE_MISC_INT = { LNTH, YPOJ, IROS, TBRZ, OSLU, "Void" };
	public static final String[] NAMES_STORAGE_MISC_LOC = { YPO, "Lanthanides", IROS, TBRZ, OSLU, "Voidmetal" };

	public static final int[] COLOR_STORAGE_ORE = { COLOR_CU, COLOR_ZN, COLOR_SN, COLOR_NI, COLOR_AG, COLOR_PB, COLOR_LU, COLOR_W, COLOR_IR, COLOR_BI, COLOR_AS, COLOR_SB, COLOR_ND, COLOR_OS, COLOR_PD, COLOR_AL };
	public static final int[] COLOR_STORAGE_ALLOY_1 = { COLOR_CUZN, COLOR_CUSN, COLOR_CUAS, COLOR_CUSB, COLOR_CUBI, COLOR_MTHR, COLOR_CUAL, COLOR_CUNI, COLOR_RBRZ, COLOR_CNST, COLOR_FENI, COLOR_AUAG, COLOR_WRDM, COLOR_DRDS, COLOR_RDSR };
	public static final int[] COLOR_STORAGE_SPECIAL = { COLOR_TELC, COLOR_TRBR, COLOR_STEL, COLOR_TSTL, COLOR_VBRS, COLOR_VSTL, COLOR_VDWT, COLOR_VCPN };
	public static final int[] COLOR_STORAGE_EQUIPMENT = { COLOR_WBRZ, COLOR_WDST, COLOR_WRBR, COLOR_WCMP, COLOR_ARDS, COLOR_RDBR, COLOR_HRBR, COLOR_FSTL, COLOR_FLXW, COLOR_MCMP, COLOR_FLUX, COLOR_RCMP, COLOR_EVBS, COLOR_CTHM, COLOR_OCVW };
	public static final int[] COLOR_STORAGE_GEM = { CLEAR, CLEAR, CLEAR, CLEAR, CLEAR, CLEAR, CLEAR, COLOR_WQRZ, CLEAR, COLOR_FLUX };
	public static final int[] COLOR_STORAGE_MISC = { COLOR_LNTH, COLOR_YPOJ, COLOR_IROS, COLOR_TBRZ, COLOR_OSLU, CLEAR };

	public static final float[] HARDNESS_STORAGE_ORE = 	{ 5, 5, 5, 7, 5, 4, 8, 10, 13, 5, 4, 4, 6, 12, 5, 5 };
	public static final float[] HARDNESS_STORAGE_ALLOY_1 = { 5, 5, 6, 6, 5, 5, 5, 5, 6, 5, 6, 5, 5, 5, 5 };
	public static final float[] HARDNESS_STORAGE_SPECIAL = { 6, 7, 8, 9, 6, 10, 20, 7 };
	public static final float[] HARDNESS_STORAGE_EQUIPMENT = { 8, 11, 10, 25, 5, 8, 10, 12, 20, 25, 30, 35, 7, 8, 25 };
	public static final float[] HARDNESS_STORAGE_GEM = { 7, 7, 7, 10, 12, 16, 20, 0.8F, 1.2F, 0.8F };
	public static final float[] HARDNESS_STORAGE_MISC = { 5, 5, 12, 6, 12, 6 };

	public static final float[] RESISTANCE_STORAGE_ORE = { 6, 6, 6, 6, 6, 12, 10, 25, 24, 8, 5, 5, 8, 30, 6, 8 };
	public static final float[] RESISTANCE_STORAGE_ALLOY_1 = { 6, 7, 8, 8, 8, 10, 6, 6, 12, 6, 8, 6, 6, 6, 6 };
	public static final float[] RESISTANCE_STORAGE_SPECIAL = { 8, 16, 15, 20, 12, 25, 50, 10 };
	public static final float[] RESISTANCE_STORAGE_EQUIPMENT = { 12, 35, 25, 100, 6, 25, 40, 40, 50, 80, 120, 160, 15, 35, 100 };
	public static final float[] RESISTANCE_STORAGE_GEM = { 13, 13, 13, 20, 20, 30, 40, 25, 30, 25 };
	public static final float[] RESISTANCE_STORAGE_MISC = { 6, 6, 35, 10, 25, 10 };

	public static final int[] MINE_LVL_STORAGE_ORE = { 1, 1, 1, 2, 2, 2, 2, 3, 3, 1, 1, 1, 2, 2, 2, 1 };
	public static final int[] MINE_LVL_STORAGE_ALLOY_1 = { 1, 1, 1, 1, 1, 2, 1, 1, 2, 1, 2, 2, 2, 2, 2 };
	public static final int[] MINE_LVL_STORAGE_SPECIAL = { 2, 2, 2, 2, 1, 2, 3, 2 };
	public static final int[] MINE_LVL_STORAGE_EQUIPMENT = { 2, 2, 2, 3, 2, 2, 2, 2, 3, 3, 3, 3, 1, 2, 3 };
	public static final int[] MINE_LVL_STORAGE_GEM = { 3, 3, 3, 3, 2, 3, 3, 1, 1, 1 };
	public static final int[] MINE_LVL_STORAGE_MISC = { 2, 2, 3, 2, 3, 1 };

	public static final int[] LIGHT_STORAGE_ORE = { 0, 0, 0, 0, 4, 0, 1, 0, 4, 2, 0, 0, 1, 1, 2, 2};
	public static final int[] LIGHT_STORAGE_ALLOY_1 = { 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 2, 0, 0, 2 };
	public static final int[] LIGHT_STORAGE_SPECIAL = { 6, 1, 0, 0, 0, 0, 0, 0 };
	public static final int[] LIGHT_STORAGE_EQUIPMENT = { 0, 1, 1, 2, 2, 1, 0, 2, 4, 3, 6, 12, 1, 0, 4 };
	public static final int[] LIGHT_STORAGE_GEM = { 4, 4, 8, 15, 4, 8, 12, 0, 2, 0 };
	public static final int[] LIGHT_STORAGE_MISC = { 0, 0, 1, 0, 1, 0 };

	public static final int[] RARITY_STORAGE_ORE = 	{ 0, 0, 0, 0, 0, 0, 1, 1, 2, 0, 0, 0, 1, 1,	1, 0 };
	public static final int[] RARITY_STORAGE_ALLOY_1 = { 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0 };
	public static final int[] RARITY_STORAGE_SPECIAL = { 1, 1, 1, 1, 1, 1, 2, 1 };
	public static final int[] RARITY_STORAGE_EQUIPMENT = { 0, 1, 1, 2, 0, 0, 1, 1, 2, 2, 2, 3, 1, 1, 2};
	public static final int[] RARITY_STORAGE_GEM = { 2, 2, 2, 3, 2, 2, 3, 1, 1, 1 };
	public static final int[] RARITY_STORAGE_MISC = { 1, 1, 2, 0, 2, 0 };

	public static final int[] SIGNAL_STORAGE_EQUIPMENT = { 0, 0, 0, 0, 8, 4, 3, 6, 12, 8, 15, 0, 0, 0 };

	public static final int[] LINK_STORAGE_GEM_META = { 0, 1, 2, 3, 4, 5, 6, 8, 9, 10 };
	public static final int[] LINK_STORAGE_GEM_IND = { 0, 1, 2, 3, 4, 5, 6, 0, 7, 8, 9 };
	public static final int[] LINK_STORAGE_MISC_META = { 0, 1, 2, 8, 9, 15 };
	public static final int[] LINK_STORAGE_MISC_IND = { 0, 1, 2, 0, 0, 0, 0, 0, 3, 4, 0, 0, 0, 0, 0, 5 };


	/** NBT KEYS **/
	@Deprecated
	public static final String INVENTORY = "Items";
	@Deprecated
	public static final String SLOT = "Slot";
	@Deprecated
	public static final String BROKEN = "Broken";
	@Deprecated
	public static final String VISMODIFIER = "VisDiscount";

	/** CLIENT-SIDE * */
	public static int renderDecorStoneID;
	//public static int wardedChestRenderID = -1;
}
