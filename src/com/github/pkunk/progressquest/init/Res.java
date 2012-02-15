package com.github.pkunk.progressquest.init;

import com.github.pkunk.progressquest.gameplay.EquipItem;
import com.github.pkunk.progressquest.gameplay.Monster;
import com.github.pkunk.progressquest.gameplay.RaceClass;
import com.github.pkunk.progressquest.gameplay.Stats;
import com.github.pkunk.progressquest.util.ResList;

import java.util.Arrays;

/**
 * User: pkunk
 * Date: 2012-01-02
 */
public class Res {

    public static  final ResList<String> SPELLS = new ResList<String>(Arrays.asList(
            "Slime Finger",
            "Rabbit Punch",
            "Hastiness",
            "Good Move",
            "Sadness",
            "Seasick",
            "Gyp",
            "Shoelaces",
            "Innoculate",
            "Cone of Annoyance",
            "Magnetic Orb",
            "Invisible Hands",
            "Revolting Cloud",
            "Aqueous Humor",
            "Spectral Miasma",
            "Clever Fellow",
            "Lockjaw",
            "History Lesson",
            "Hydrophobia",
            "Big Sister",
            "Cone of Paste",
            "Mulligan",
            "Nestor's Bright Idea",
            "Holy Batpole",
            "Tumor (Benign)",
            "Braingate",
            "Summon a Bitch",
            "Nonplus",
            "Animate Nightstand",
            "Eye of the Troglodyte",
            "Curse Name",
            "Dropsy",
            "Vitreous Humor",
            "Roger's Grand Illusion",
            "Covet",
            "Black Idaho",
            "Astral Miasma",
            "Spectral Oyster",
            "Acrid Hands",
            "Angioplasty",
            "Grognor's Big Day Off",
            "Tumor (Malignant)",
            "Animate Tunic",
            "Ursine Armor",
            "Holy Roller",
            "Tonsilectomy",
            "Curse Family",
            "Infinite Confusion"
    ));

    public static  final ResList<Monster> MONSTERS = new ResList<Monster>(Arrays.asList(
            new Monster("Anhkheg", 6, "chitin"),
            new Monster("Ant", 0, "antenna"),
            new Monster("Ape", 4, "ass"),
            new Monster("Baluchitherium", 14, "ear"),
            new Monster("Beholder", 10, "eyestalk"),
            new Monster("Black Pudding", 10, "saliva"),
            new Monster("Blink Dog", 4, "eyelid"),
            new Monster("Cub Scout", 1, "neckerchief"),
            new Monster("Girl Scout", 2, "cookie"),
            new Monster("Boy Scout", 3, "merit badge"),
            new Monster("Eagle Scout", 4, "merit badge"),
            new Monster("Bugbear", 3, "skin"),
            new Monster("Bugboar", 3, "tusk"),
            new Monster("Boogie", 3, "slime"),
            new Monster("Camel", 2, "hump"),
            new Monster("Carrion Crawler", 3, "egg"),
            new Monster("Catoblepas", 6, "neck"),
            new Monster("Centaur", 4, "rib"),
            new Monster("Centipede", 0, "leg"),
            new Monster("Cockatrice", 5, "wattle"),
            new Monster("Couatl", 9, "wing"),
            new Monster("Crayfish", 0, "antenna"),
            new Monster("Demogorgon", 53, "tentacle"),
            new Monster("Jubilex", 17, "gel"),
            new Monster("Manes", 1, "tooth"),
            new Monster("Orcus", 27, "wand"),
            new Monster("Succubus", 6, "bra"),
            new Monster("Vrock", 8, "neck"),
            new Monster("Hezrou", 9, "leg"),
            new Monster("Glabrezu", 10, "collar"),
            new Monster("Nalfeshnee", 11, "tusk"),
            new Monster("Marilith", 7, "arm"),
            new Monster("Balor", 8, "whip"),
            new Monster("Yeenoghu", 25, "flail"),
            new Monster("Asmodeus", 52, "leathers"),
            new Monster("Baalzebul", 43, "pants"),
            new Monster("Barbed Devil", 8, "flame"),
            new Monster("Bone Devil", 9, "hook"),
            new Monster("Dispater", 30, "matches"),
            new Monster("Erinyes", 6, "thong"),
            new Monster("Geryon", 30, "cornucopia"),
            new Monster("Malebranche", 5, "fork"),
            new Monster("Ice Devil", 11, "snow"),
            new Monster("Lemure", 3, "blob"),
            new Monster("Pit Fiend", 13, "seed"),
            new Monster("Anklyosaurus", 9, "tail"),
            new Monster("Brontosaurus", 30, "brain"),
            new Monster("Diplodocus", 24, "fin"),
            new Monster("Elasmosaurus", 15, "neck"),
            new Monster("Gorgosaurus", 13, "arm"),
            new Monster("Iguanadon", 6, "thumb"),
            new Monster("Megalosaurus", 12, "jaw"),
            new Monster("Monoclonius", 8, "horn"),
            new Monster("Pentasaurus", 12, "head"),
            new Monster("Stegosaurus", 18, "plate"),
            new Monster("Triceratops", 16, "horn"),
            new Monster("Tyranosauraus Rex", 18, "forearm"),
            new Monster("Djinn", 7, "lamp"),
            new Monster("Doppleganger", 4, "face"),
            new Monster("Black Dragon", 7, "*"),
            new Monster("Plaid Dragon", 7, "sporrin"),
            new Monster("Blue Dragon", 9, "*"),
            new Monster("Beige Dragon", 9, "*"),
            new Monster("Brass Dragon", 7, "pole"),
            new Monster("Tin Dragon", 8, "*"),
            new Monster("Bronze Dragon", 9, "medal"),
            new Monster("Chromatic Dragon", 16, "scale"),
            new Monster("Copper Dragon", 8, "loafer"),
            new Monster("Gold Dragon", 8, "filling"),
            new Monster("Green Dragon", 8, "*"),
            new Monster("Platinum Dragon", 21, "*"),
            new Monster("Red Dragon", 10, "cocktail"),
            new Monster("Silver Dragon", 10, "*"),
            new Monster("White Dragon", 6, "tooth"),
            new Monster("Dragon Turtle", 13, "shell"),
            new Monster("Dryad", 2, "acorn"),
            new Monster("Dwarf", 1, "drawers"),
            new Monster("Eel", 2, "sashimi"),
            new Monster("Efreet", 10, "cinder"),
            new Monster("Sand Elemental", 8, "glass"),
            new Monster("Bacon Elemental", 10, "bit"),
            new Monster("Porn Elemental", 12, "lube"),
            new Monster("Cheese Elemental", 14, "curd"),
            new Monster("Hair Elemental", 16, "follicle"),
            new Monster("Swamp Elf", 1, "lilypad"),
            new Monster("Brown Elf", 1, "tusk"),
            new Monster("Sea Elf", 1, "jerkin"),
            new Monster("Ettin", 10, "fur"),
            new Monster("Frog", 0, "leg"),
            new Monster("Violet Fungi", 3, "spore"),
            new Monster("Gargoyle", 4, "gravel"),
            new Monster("Gelatinous Cube", 4, "jam"),
            new Monster("Ghast", 4, "vomit"),
            new Monster("Ghost", 10, "*"),
            new Monster("Ghoul", 2, "muscle"),
            new Monster("Humidity Giant", 12, "drops"),
            new Monster("Beef Giant", 11, "steak"),
            new Monster("Quartz Giant", 10, "crystal"),
            new Monster("Porcelain Giant", 9, "fixture"),
            new Monster("Rice Giant", 8, "grain"),
            new Monster("Cloud Giant", 12, "condensation"),
            new Monster("Fire Giant", 11, "cigarettes"),
            new Monster("Frost Giant", 10, "snowman"),
            new Monster("Hill Giant", 8, "corpse"),
            new Monster("Stone Giant", 9, "hatchling"),
            new Monster("Storm Giant", 15, "barometer"),
            new Monster("Mini Giant", 4, "pompadour"),
            new Monster("Gnoll", 2, "collar"),
            new Monster("Gnome", 1, "hat"),
            new Monster("Goblin", 1, "ear"),
            new Monster("Grid Bug", 1, "carapace"),
            new Monster("Jellyrock", 9, "seedling"),
            new Monster("Beer Golem", 15, "foam"),
            new Monster("Oxygen Golem", 17, "platelet"),
            new Monster("Cardboard Golem", 14, "recycling"),
            new Monster("Rubber Golem", 16, "ball"),
            new Monster("Leather Golem", 15, "fob"),
            new Monster("Gorgon", 8, "testicle"),
            new Monster("Gray Ooze", 3, "gravy"),
            new Monster("Green Slime", 2, "sample"),
            new Monster("Griffon", 7, "nest"),
            new Monster("Banshee", 7, "larynx"),
            new Monster("Harpy", 3, "mascara"),
            new Monster("Hell Hound", 5, "tongue"),
            new Monster("Hippocampus", 4, "mane"),
            new Monster("Hippogriff", 3, "egg"),
            new Monster("Hobgoblin", 1, "patella"),
            new Monster("Homonculus", 2, "fluid"),
            new Monster("Hydra", 8, "gyrum"),
            new Monster("Imp", 2, "tail"),
            new Monster("Invisible Stalker", 8, "*"),
            new Monster("Iron Peasant", 3, "chaff"),
            new Monster("Jumpskin", 3, "shin"),
            new Monster("Kobold", 1, "penis"),
            new Monster("Leprechaun", 1, "wallet"),
            new Monster("Leucrotta", 6, "hoof"),
            new Monster("Lich", 11, "crown"),
            new Monster("Lizard Man", 2, "tail"),
            new Monster("Lurker", 10, "sac"),
            new Monster("Manticore", 6, "spike"),
            new Monster("Mastodon", 12, "tusk"),
            new Monster("Medusa", 6, "eye"),
            new Monster("Multicell", 2, "dendrite"),
            new Monster("Pirate", 1, "booty"),
            new Monster("Berserker", 1, "shirt"),
            new Monster("Caveman", 2, "club"),
            new Monster("Dervish", 1, "robe"),
            new Monster("Merman", 1, "trident"),
            new Monster("Mermaid", 1, "gills"),
            new Monster("Mimic", 9, "hinge"),
            new Monster("Mind Flayer", 8, "tentacle"),
            new Monster("Minotaur", 6, "map"),
            new Monster("Yellow Mold", 1, "spore"),
            new Monster("Morkoth", 7, "teeth"),
            new Monster("Mummy", 6, "gauze"),
            new Monster("Naga", 9, "rattle"),
            new Monster("Nebbish", 1, "belly"),
            new Monster("Neo-Otyugh", 11, "organ"),
            new Monster("Nixie", 1, "webbing"),
            new Monster("Nymph", 3, "hanky"),
            new Monster("Ochre Jelly", 6, "nucleus"),
            new Monster("Octopus", 2, "beak"),
            new Monster("Ogre", 4, "talon"),
            new Monster("Ogre Mage", 5, "apparel"),
            new Monster("Orc", 1, "snout"),
            new Monster("Otyugh", 7, "organ"),
            new Monster("Owlbear", 5, "feather"),
            new Monster("Pegasus", 4, "aileron"),
            new Monster("Peryton", 4, "antler"),
            new Monster("Piercer", 3, "tip"),
            new Monster("Pixie", 1, "dust"),
            new Monster("Man-o-war", 3, "tentacle"),
            new Monster("Purple Worm", 15, "dung"),
            new Monster("Quasit", 3, "tail"),
            new Monster("Rakshasa", 7, "pajamas"),
            new Monster("Rat", 0, "tail"),
            new Monster("Remorhaz", 11, "protrusion"),
            new Monster("Roc", 18, "wing"),
            new Monster("Roper", 11, "twine"),
            new Monster("Rot Grub", 1, "eggsac"),
            new Monster("Rust Monster", 5, "shavings"),
            new Monster("Satyr", 5, "hoof"),
            new Monster("Sea Hag", 3, "wart"),
            new Monster("Silkie", 3, "fur"),
            new Monster("Shadow", 3, "silhouette"),
            new Monster("Shambling Mound", 10, "mulch"),
            new Monster("Shedu", 9, "hoof"),
            new Monster("Shrieker", 3, "stalk"),
            new Monster("Skeleton", 1, "clavicle"),
            new Monster("Spectre", 7, "vestige"),
            new Monster("Sphinx", 10, "paw"),
            new Monster("Spider", 0, "web"),
            new Monster("Sprite", 1, "can"),
            new Monster("Stirge", 1, "proboscis"),
            new Monster("Stun Bear", 5, "tooth"),
            new Monster("Stun Worm", 2, "trode"),
            new Monster("Su-monster", 5, "tail"),
            new Monster("Sylph", 3, "thigh"),
            new Monster("Titan", 20, "sandal"),
            new Monster("Trapper", 12, "shag"),
            new Monster("Treant", 10, "acorn"),
            new Monster("Triton", 3, "scale"),
            new Monster("Troglodyte", 2, "tail"),
            new Monster("Troll", 6, "hide"),
            new Monster("Umber Hulk", 8, "claw"),
            new Monster("Unicorn", 4, "blood"),
            new Monster("Vampire", 8, "pancreas"),
            new Monster("Wight", 4, "lung"),
            new Monster("Will-o'-the-Wisp", 9, "wisp"),
            new Monster("Wraith", 5, "finger"),
            new Monster("Wyvern", 7, "wing"),
            new Monster("Xorn", 7, "jaw"),
            new Monster("Yeti", 4, "fur"),
            new Monster("Zombie", 2, "forehead"),
            new Monster("Wasp", 0, "stinger"),
            new Monster("Rat", 1, "tail"),
            new Monster("Bunny", 0, "ear"),
            new Monster("Moth", 0, "dust"),
            new Monster("Beagle", 0, "collar"),
            new Monster("Midge", 0, "corpse"),
            new Monster("Ostrich", 1, "beak"),
            new Monster("Billy Goat", 1, "beard"),
            new Monster("Bat", 1, "wing"),
            new Monster("Koala", 2, "heart"),
            new Monster("Wolf", 2, "paw"),
            new Monster("Whippet", 2, "collar"),
            new Monster("Uruk", 2, "boot"),
            new Monster("Poroid", 4, "node"),
            new Monster("Moakum", 8, "frenum"),
            new Monster("Fly", 0, "*"),
            new Monster("Hogbird", 3, "curl"),
            new Monster("Wolog", 4, "lemma")
    ));


    public static  final ResList<String> SPECIAL_ITEMS = new ResList<String>(Arrays.asList(
            "Diadem",
            "Festoon",
            "Gemstone",
            "Phial",
            "Tiara",
            "Scabbard",
            "Arrow",
            "Lens",
            "Lamp",
            "Hymnal",
            "Fleece",
            "Laurel",
            "Brooch",
            "Gimlet",
            "Cobble",
            "Albatross",
            "Brazier",
            "Bandolier",
            "Tome",
            "Garnet",
            "Amethyst",
            "Candelabra",
            "Corset",
            "Sphere",
            "Sceptre",
            "Ankh",
            "Talisman",
            "Orb",
            "Gammel",
            "Ornament",
            "Brocade",
            "Galoon",
            "Bijou",
            "Spangle",
            "Gimcrack",
            "Hood",
            "Vulpeculum"
    ));

    public static  final ResList<String> ITEM_ATTRIB = new ResList<String>(Arrays.asList(
            "Golden",
            "Gilded",
            "Spectral",
            "Astral",
            "Garlanded",
            "Precious",
            "Crafted",
            "Dual",
            "Filigreed",
            "Cruciate",
            "Arcane",
            "Blessed",
            "Reverential",
            "Lucky",
            "Enchanted",
            "Gleaming",
            "Grandiose",
            "Sacred",
            "Legendary",
            "Mythic",
            "Crystalline",
            "Austere",
            "Ostentatious",
            "One True",
            "Proverbial",
            "Fearsome",
            "Deadly",
            "Benevolent",
            "Unearthly",
            "Magnificent",
            "Iron",
            "Ormolu",
            "Puissant"
    ));

    public static  final ResList<String> ITEM_OFS = new ResList<String>(Arrays.asList(
            "Foreboding",
            "Foreshadowing",
            "Nervousness",
            "Happiness",
            "Torpor",
            "Danger",
            "Craft",
            "Silence",
            "Invisibility",
            "Rapidity",
            "Pleasure",
            "Practicality",
            "Hurting",
            "Joy",
            "Petulance",
            "Intrusion",
            "Chaos",
            "Suffering",
            "Extroversion",
            "Frenzy",
            "Solitude",
            "Punctuality",
            "Efficiency",
            "Comfort",
            "Patience",
            "Internment",
            "Incarceration",
            "Misapprehension",
            "Loyalty",
            "Envy",
            "Acrimony",
            "Worry",
            "Fear",
            "Awe",
            "Guile",
            "Prurience",
            "Fortune",
            "Perspicacity",
            "Domination",
            "Submission",
            "Fealty",
            "Hunger",
            "Despair",
            "Cruelty",
            "Grob",
            "Dignard",
            "Ra",
            "the Bone",
            "Diamonique",
            "Electrum",
            "Hydragyrum"
    ));

    public static  final ResList<String> BORING_ITEMS = new ResList<String>(Arrays.asList(
            "nail",
            "lunchpail",
            "sock",
            "I.O.U.",
            "cookie",
            "pint",
            "toothpick",
            "writ",
            "newspaper",
            "letter",
            "plank",
            "hat",
            "egg",
            "coin",
            "needle",
            "bucket",
            "ladder",
            "chicken",
            "twig",
            "dirtclod",
            "counterpane",
            "vest",
            "teratoma",
            "bunny",
            "rock",
            "pole",
            "carrot",
            "canoe",
            "inkwell",
            "hoe",
            "bandage",
            "trowel",
            "towel",
            "planter box",
            "anvil",
            "axle",
            "tuppence",
            "casket",
            "nosegay",
            "trinket",
            "credenza",
            "writ"
    ));

    public static  final ResList<EquipItem> WEAPONS = new ResList<EquipItem>(Arrays.asList(
            new EquipItem("Stick", 0),
            new EquipItem("Broken Bottle", 1),
            new EquipItem("Shiv", 1),
            new EquipItem("Sprig", 1),
            new EquipItem("Oxgoad", 1),
            new EquipItem("Eelspear", 2),
            new EquipItem("Bowie Knife", 2),
            new EquipItem("Claw Hammer", 2),
            new EquipItem("Handpeen", 2),
            new EquipItem("Andiron", 3),
            new EquipItem("Hatchet", 3),
            new EquipItem("Tomahawk", 3),
            new EquipItem("Hackbarm", 3),
            new EquipItem("Crowbar", 4),
            new EquipItem("Mace", 4),
            new EquipItem("Battleadze", 4),
            new EquipItem("Leafmace", 5),
            new EquipItem("Shortsword", 5),
            new EquipItem("Longiron", 5),
            new EquipItem("Poachard", 5),
            new EquipItem("Baselard", 5),
            new EquipItem("Whinyard", 6),
            new EquipItem("Blunderbuss", 6),
            new EquipItem("Longsword", 6),
            new EquipItem("Crankbow", 6),
            new EquipItem("Blibo", 7),
            new EquipItem("Broadsword", 7),
            new EquipItem("Kreen", 7),
            new EquipItem("Morning Star", 8),
            new EquipItem("Pole-adze", 8),
            new EquipItem("Spontoon", 8),
            new EquipItem("Bastard Sword", 9),
            new EquipItem("Peen-arm", 9),
            new EquipItem("Culverin", 10),
            new EquipItem("Lance", 10),
            new EquipItem("Halberd", 11),
            new EquipItem("Poleax", 12),
            new EquipItem("Bandyclef", 15)
    ));

    public static  final ResList<EquipItem> ARMORS = new ResList<EquipItem>(Arrays.asList(
            new EquipItem("Lace", 1),
            new EquipItem("Macrame", 2),
            new EquipItem("Burlap", 3),
            new EquipItem("Canvas", 4),
            new EquipItem("Flannel", 5),
            new EquipItem("Chamois", 6),
            new EquipItem("Pleathers", 7),
            new EquipItem("Leathers", 8),
            new EquipItem("Bearskin", 9),
            new EquipItem("Ringmail", 10),
            new EquipItem("Scale Mail", 12),
            new EquipItem("Chainmail", 14),
            new EquipItem("Splint Mail", 15),
            new EquipItem("Platemail", 16),
            new EquipItem("ABS", 17),
            new EquipItem("Kevlar", 18),
            new EquipItem("Titanium", 19),
            new EquipItem("Mithril Mail", 20),
            new EquipItem("Diamond Mail", 25),
            new EquipItem("Plasma", 30)
    ));

    public static  final ResList<EquipItem> SHIELDS = new ResList<EquipItem>(Arrays.asList(
            new EquipItem("Parasol", 0),
            new EquipItem("Pie Plate", 1),
            new EquipItem("Garbage Can Lid", 2),
            new EquipItem("Buckler", 3),
            new EquipItem("Plexiglass", 4),
            new EquipItem("Fender", 4),
            new EquipItem("Round Shield", 5),
            new EquipItem("Carapace", 5),
            new EquipItem("Scutum", 6),
            new EquipItem("Propugner", 6),
            new EquipItem("Kite Shield", 7),
            new EquipItem("Pavise", 8),
            new EquipItem("Tower Shield", 9),
            new EquipItem("Baroque Shield", 11),
            new EquipItem("Aegis", 12),
            new EquipItem("Magnetic Field", 18)
    ));

    public static  final ResList<EquipItem> OFFENSE_ATTRIB = new ResList<EquipItem>(Arrays.asList(
            new EquipItem("Polished", +1),
            new EquipItem("Serrated", +1),
            new EquipItem("Heavy", +1),
            new EquipItem("Pronged", +2),
            new EquipItem("Steely", +2),
            new EquipItem("Vicious", +3),
            new EquipItem("Venomed", +4),
            new EquipItem("Stabbity", +4),
            new EquipItem("Dancing", +5),
            new EquipItem("Invisible", +6),
            new EquipItem("Vorpal", +7)
    ));

    public static  final ResList<EquipItem> DEFENSE_ATTRIB = new ResList<EquipItem>(Arrays.asList(
            new EquipItem("Studded", +1),
            new EquipItem("Banded", +2),
            new EquipItem("Gilded", +2),
            new EquipItem("Festooned", +3),
            new EquipItem("Holy", +4),
            new EquipItem("Cambric", +1),
            new EquipItem("Fine", +4),
            new EquipItem("Impressive", +5),
            new EquipItem("Custom", +3)
    ));

    public static  final ResList<EquipItem> OFFENSE_BAD = new ResList<EquipItem>(Arrays.asList(
            new EquipItem("Dull", -2),
            new EquipItem("Tarnished", -1),
            new EquipItem("Rusty", -3),
            new EquipItem("Padded", -5),
            new EquipItem("Bent", -4),
            new EquipItem("Mini", -4),
            new EquipItem("Rubber", -6),
            new EquipItem("Nerf", -7),
            new EquipItem("Unbalanced", -2)
    ));

    public static  final ResList<EquipItem> DEFENSE_BAD = new ResList<EquipItem>(Arrays.asList(
            new EquipItem("Holey", -1),
            new EquipItem("Patched", -1),
            new EquipItem("Threadbare", -2),
            new EquipItem("Faded", -1),
            new EquipItem("Rusty", -3),
            new EquipItem("Motheaten", -3),
            new EquipItem("Mildewed", -2),
            new EquipItem("Torn", -3),
            new EquipItem("Dented", -3),
            new EquipItem("Cursed", -5),
            new EquipItem("Plastic", -4),
            new EquipItem("Cracked", -4),
            new EquipItem("Warped", -3),
            new EquipItem("Corroded", -3)
    ));

    public static  final ResList<String> TITLES = new ResList<String>(Arrays.asList(
            "Mr.",
            "Mrs.",
            "Sir",
            "Sgt.",
            "Ms.",
            "Captain",
            "Chief",
            "Admiral",
            "Saint"
    ));

    public static  final ResList<String> IMPRESSIVE_TITLES = new ResList<String>(Arrays.asList(
            "King",
            "Queen",
            "Lord",
            "Lady",
            "Viceroy",
            "Mayor",
            "Prince",
            "Princess",
            "Chief",
            "Boss",
            "Archbishop"
    ));

    public static  final ResList<ResList<String>> PARTS = new ResList<ResList<String>>(Arrays.asList(
            new ResList<String>(Arrays.asList("br","cr","dr","fr","gr","j","kr","l","m","n","pr","","","","r","sh","tr","v","wh","x","y","z")),
            new ResList<String>(Arrays.asList("a","a","e","e","i","i","o","o","u","u","ae","ie","oo","ou")),
            new ResList<String>(Arrays.asList("b","ck","d","g","k","m","n","p","t","v","x","z"))
    ));

    public static  final ResList<RaceClass> RACES = new ResList<RaceClass>(Arrays.asList(
            new RaceClass("Half Orc",               Stats.newBonuses(Stats.HP_MAX)),
            new RaceClass("Half Man",               Stats.newBonuses(Stats.CHA)),
            new RaceClass("Half Halfling",          Stats.newBonuses(Stats.DEX)),
            new RaceClass("Double Hobbit",          Stats.newBonuses(Stats.STR)),
            new RaceClass("Hob-Hobbit",             Stats.newBonuses(Stats.DEX, Stats.CON)),
            new RaceClass("Low Elf",                Stats.newBonuses(Stats.CON)),
            new RaceClass("Dung Elf",               Stats.newBonuses(Stats.WIS)),
            new RaceClass("Talking Pony",           Stats.newBonuses(Stats.MP_MAX, Stats.INT)),
            new RaceClass("Gyrognome",              Stats.newBonuses(Stats.DEX)),
            new RaceClass("Lesser Dwarf",           Stats.newBonuses(Stats.CON)),
            new RaceClass("Crested Dwarf",          Stats.newBonuses(Stats.CHA)),
            new RaceClass("Eel Man",                Stats.newBonuses(Stats.DEX)),
            new RaceClass("Panda Man",              Stats.newBonuses(Stats.CON, Stats.STR)),
            new RaceClass("Trans-Kobold",           Stats.newBonuses(Stats.WIS)),
            new RaceClass("Enchanted Motorcycle",   Stats.newBonuses(Stats.MP_MAX)),
            new RaceClass("Will o' the Wisp",       Stats.newBonuses(Stats.WIS)),
            new RaceClass("Battle-Finch",           Stats.newBonuses(Stats.DEX, Stats.INT)),
            new RaceClass("Double Wookiee",         Stats.newBonuses(Stats.STR)),
            new RaceClass("Skraeling",              Stats.newBonuses(Stats.WIS)),
            new RaceClass("Demicanadian",           Stats.newBonuses(Stats.CON)),
            new RaceClass("Land Squid",             Stats.newBonuses(Stats.STR, Stats.HP_MAX))
    ));

    public static  final ResList<RaceClass> KLASSES = new ResList<RaceClass>(Arrays.asList(
            new RaceClass("Ur-Paladin",             Stats.newBonuses(Stats.WIS, Stats.CON)),
            new RaceClass("Voodoo Princess",        Stats.newBonuses(Stats.INT, Stats.CHA)),
            new RaceClass("Robot Monk",             Stats.newBonuses(Stats.STR)),
            new RaceClass("Mu-Fu Monk",             Stats.newBonuses(Stats.DEX)),
            new RaceClass("Mage Illusioner",        Stats.newBonuses(Stats.INT, Stats.MP_MAX)),
            new RaceClass("Shiv-Knight",            Stats.newBonuses(Stats.DEX)),
            new RaceClass("Inner Mason",            Stats.newBonuses(Stats.CON)),
            new RaceClass("Fighter/Organist",       Stats.newBonuses(Stats.CHA, Stats.STR)),
            new RaceClass("Puma Burgular",          Stats.newBonuses(Stats.DEX)),
            new RaceClass("Runeloremaster",         Stats.newBonuses(Stats.WIS)),
            new RaceClass("Hunter Strangler",       Stats.newBonuses(Stats.DEX, Stats.INT)),
            new RaceClass("Battle-Felon",           Stats.newBonuses(Stats.STR)),
            new RaceClass("Tickle-Mimic",           Stats.newBonuses(Stats.WIS, Stats.INT)),
            new RaceClass("Slow Poisoner",          Stats.newBonuses(Stats.CON)),
            new RaceClass("Bastard Lunatic",        Stats.newBonuses(Stats.CON)),
            new RaceClass("Lowling",                Stats.newBonuses(Stats.WIS)),
            new RaceClass("Birdrider",              Stats.newBonuses(Stats.WIS)),
            new RaceClass("Vermineer",              Stats.newBonuses(Stats.INT))
    ));


    public static  final ResList<String> MERITS = new ResList<String>(Arrays.asList(
            "faithful",
            "noble",
            "loyal",
            "brave"
    ));
}
