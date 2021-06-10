
-- Populate category table -OK
INSERT INTO category ("name", "description") VALUES
('French', 'The French have always had an eye for beauty. One look at the T-shirts below and you''ll see that same appreciation has been applied abundantly to their postage stamps. Below are some of our most beautiful and colorful T-shirts, so browse away! And don''t forget to go all the way to the bottom - you don''t want to miss any of them!'),
('Italian', 'The full and resplendent treasure chest of art, literature, music, and science that Italy has given the world is reflected splendidly in its postal stamps. If we could, we would dedicate hundreds of T-shirts to this amazing treasure of beautiful images, but for now we will have to live with what you see here. You don''t have to be Italian to love these gorgeous T-shirts, just someone who appreciates the finer things in life!'),
('Irish', 'It was Churchill who remarked that he thought the Irish most curious because they didn''t want to be English. How right he was! But then, he was half-American, wasn''t he? If you have an Irish genealogy you will want these T-shirts! If you suddenly turn Irish on St. Patrick''s Day, you too will want these T-shirts! Take a look at some of the coolest T-shirts we have!'),
('Animal', ' Our ever-growing selection of beautiful animal T-shirts represents critters from everywhere, both wild and domestic. If you don''t see the T-shirt with the animal you''re looking for, tell us and we''ll find it!'),
('Flower', 'These unique and beautiful flower T-shirts are just the item for the gardener, flower arranger, florist, or general lover of things beautiful. Surprise the flower in your life with one of the beautiful botanical T-shirts or just get a few for yourself!'),
('Christmas', ' Because this is a unique Christmas T-shirt that you''ll only wear a few times a year, it will probably last for decades (unless some grinch nabs it from you, of course). Far into the future, after you''re gone, your grandkids will pull it out and argue over who gets to wear it. What great snapshots they''ll make dressed in Grandpa or Grandma''s incredibly tasteful and unique Christmas T-shirt! Yes, everyone will remember you forever and what a silly goof you were when you would wear only your Santa beard and cap so you wouldn''t cover up your nifty T-shirt.'),
('Valentine''s', 'For the more timid, all you have to do is wear your heartfelt message to get it across. Buy one for you and your sweetie(s) today!');

-- Populate product table -OK
INSERT INTO product ("name", "description", "price", "image", "image_2", "image_3") VALUES
('Arc d''Triomphe', 'This beautiful and iconic T-shirt will no doubt lead you to your own triumph.', 14990, 'arc-d-triomphe.gif', 'arc-d-triomphe_2.gif', 'arc-d-triomphe-3.gif'),
('Chartres Cathedral', '"The Fur Merchants". Not all the beautiful stained glass in the great cathedrals depicts saints and angels! Lay aside your furs for the summer and wear this beautiful T-shirt!', 16950, 'chartres-cathedral.gif', 'chartres-cathedral_2.gif', 'chartres-cathedral-3.gif'),
('Coat of Arms', 'There''s good reason why the ship plays a prominent part on this shield!', 14500, 'coat-of-arms.gif', 'coat-of-arms_2.gif', 'coat-of-arms-3.gif'),
('Gallic Cock', 'This fancy chicken is perhaps the most beloved of all French symbols. Unfortunately, there are only a few hundred left, so you''d better get your T-shirt now!', 18990, 'gallic-cock.gif', 'gallic-cock.gif_2', 'gallic-cock-3.gif'),
('Marianne', 'She symbolizes the "Triumph of the Republic" and has been depicted many different ways in the history of France, as you will see below!', 15950, 'marianne.gif', 'marianne_2.gif', 'marianne-3.gif'),
('Alsace', 'It was in this region of France that Gutenberg perfected his movable type. If he could only see what he started!', 16500, 'alsace.gif', 'alsace-2.gif', 'alsace-3.gif'),
('Apocalypse Tapestry', 'One of the most famous tapestries of the Loire Valley, it dates from the 14th century. The T-shirt is of more recent vintage, however.', 20000, 'apocalypse-tapestry.gif', 'apocalypse-tapestry-2.gif', 'apocalypse-tapestry-3.gif'),
('Centaur', 'There were never any lady centaurs, so these guys had to mate with nymphs and mares. No wonder they were often in such bad moods!', 14990, 'centaur.gif', 'centaur-2.gif', 'centaur-3.gif'),
('Corsica', 'Borrowed from Spain, the "Moor''s head" may have celebrated the Christians'' victory over the Moslems in that country.', 22000, 'corsica.gif', 'corsica-2.gif', 'corsica-3.gif'),
('Haute Couture', 'This stamp publicized the dress making industry. Use it to celebrate the T-shirt industry!', 15990, 'haute-couture.gif', 'haute-couture-2.gif', 'haute-couture-3.gif'),
('Iris', 'Iris was the Goddess of the Rainbow, daughter of the Titans Thaumas and Electra. Are you up to this T-shirt?!', 17500, 'iris.gif', 'iris-2.gif', 'iris-3.gif'),
('Lorraine', 'The largest American cemetery in France is located in Lorraine and most of the folks there still appreciate that fact.', 16950, 'lorraine.gif', 'lorraine-2.gif', 'lorraine-3.gif'),
('Mercury', 'Besides being the messenger of the gods, did you know that Mercury was also the god of profit and commerce? This T-shirt is for business owners!', 21990, 'mercury.gif', 'mercury-2.gif', 'mercury-3.gif'),
('County of Nice', 'Nice is so nice that it has been fought over for millennia, but now it all belongs to France.', 12950, 'county-of-nice.gif', 'county-of-nice-2.gif', 'county-of-nice-3.gif'),
('Notre Dame', 'Commemorating the 800th anniversary of the famed cathedral.', 18500, 'notre-dame.gif', 'notre-dame-2.gif', 'notre-dame-3.gif'),
('Paris Peace Conference', 'The resulting treaties allowed Italy, Romania, Hungary, Bulgaria, and Finland to reassume their responsibilities as sovereign states in international affairs and thus qualify for membership in the UN.', 16950, 'paris-peace-conference.gif', 'paris-peace-conference-2.gif', 'paris-peace-conference-3.gif'),
('Sarah Bernhardt', 'The "Divine Sarah" said this about Americans: "You are younger than we as a race, you are perhaps barbaric, but what of it? You are still in the molding. Your spirit is superb. It is what helped us win the war." Perhaps we''re still barbaric but we''re still winning wars for them too!', 14990, 'sarah-bernhardt.gif', 'sarah-bernhardt-2.gif', 'sarah-bernhardt-3.gif'),
('Hunt', 'A scene from "Les Tres Riches Heures," a medieval "book of hours" containing the text for each liturgical hour of the day. This scene is from a 14th century painting.', 16990, 'hunt.gif', 'hunt-2.gif', 'hunt-3.gif'),
('Italia', 'The War had just ended when this stamp was designed, and even so, there was enough optimism to show the destroyed oak tree sprouting again from its stump! What a beautiful T-shirt!', 22000, 'italia.gif', 'italia-2.gif', 'italia-3.gif'),
('Torch', 'The light goes on! Carry the torch with this T-shirt and be a beacon of hope for the world!', 19990, 'torch.gif', 'torch-2.gif', 'torch-3.gif'),
('Espresso', 'The winged foot of Mercury speeds the Special Delivery mail to its destination. In a hurry? This T-shirt is for you!', 16950, 'espresso.gif', 'espresso-2.gif', 'espresso-3.gif'),
('Galileo', 'This beautiful T-shirt does honor to one of Italy''s (and the world''s) most famous scientists. Show your appreciation for the education you''ve received!', 14990, 'galileo.gif', 'galileo-2.gif', 'galileo-3.gif'),
('Italian Airmail', 'Thanks to modern Italian post, folks were able to reach out and touch each other. Or at least so implies this image. This is a very fast and friendly T-shirt--you''ll make friends with it!', 21000, 'italian-airmail.gif', 'italian-airmail-2.gif', 'italian-airmail-3.gif'),
('Mazzini', 'Giuseppe Mazzini is considered one of the patron saints of the "Risorgimiento." Wear this beautiful T-shirt to tell the world you agree!', 20500, 'mazzini.gif', 'mazzini-2.gif', 'mazzini-3.gif'),
('Romulus & Remus', 'Back in 753 BC, so the story goes, Romulus founded the city of Rome (in competition with Remus, who founded a city on another hill). Their adopted mother is shown in this image. When did they suspect they were adopted?', 17990, 'romulus-remus.gif', 'romulus-remus.gif', 'romulus-remus-3.gif'),
('Italy Maria', 'This beautiful image of the Virgin is from a work by Raphael, whose life and death it honors. It is one of our most popular T-shirts!', 14000, 'italy-maria.gif', 'italy-maria-2.gif', 'italy-maria-3.gif'),
('Italy Jesus', 'This image of Jesus teaching the gospel was issued to commemorate the third centenary of the "propagation of the faith." Now you can do your part with this T-shirt!', 16950, 'italy-jesus.gif', 'italy-jesus-2.gif', 'italy-jesus-3.gif'),
('St. Francis', 'Here St. Francis is receiving his vision. This dramatic and attractive stamp was issued on the 700th anniversary of that event.', 22000, 'st-francis.gif', 'st-francis-2.gif', 'st-francis-3.gif'),
('Irish Coat of Arms', 'This was one of the first stamps of the new Irish Republic, and it makes a T-shirt you''ll be proud to wear on St. Paddy''s Day!', 14990, 'irish-coat-of-arms.gif', 'irish-coat-of-arms-2.gif', 'irish-coat-of-arms-3.gif'),
('Easter Rebellion', 'The Easter Rebellion of 1916 was a defining moment in Irish history. Although only a few hundred participated and the British squashed it in a week, its leaders were executed, which galvanized the uncommitted.', 19000, 'easter-rebellion.gif', 'easter-rebellion-2.gif', 'easter-rebellion-3.gif'),
('Guiness', 'Class! Who is this man and why is he important enough for his own T-shirt?!', 15000, 'guiness.gif', 'guiness-2.gif', 'guiness-3.gif'),
('St. Patrick', 'This stamp commemorated the 1500th anniversary of the revered saint''s death. Is there a more perfect St. Patrick''s Day T-shirt?!', 20500, 'st-patrick.gif', 'st-patrick-2.gif', 'st-patrick-3.gif'),
('St. Peter', 'This T-shirt commemorates the holy year of 1950.', 16000, 'st-peter.gif', 'st-peter-2.gif', 'st-peter-3.gif'),
('Sword of Light', 'This was the very first Irish postage stamp, and what a beautiful and cool T-shirt it makes for the Irish person in your life!', 14990, 'sword-of-light.gif', 'sword-of-light-2.gif', 'sword-of-light-3.gif'),
('Thomas Moore', 'One of the greatest if not the greatest of Irish poets and writers, Moore led a very interesting life, though plagued with tragedy in a somewhat typically Irish way. Remember "The Last Rose of Summer"?', 15950, 'thomas-moore.gif', 'thomas-moore-2.gif', 'thomas-moore-3.gif'),
('Visit the Zoo', 'This WPA poster is a wonderful example of the art produced by the Works Projects Administration during the Depression years. Do you feel like you sometimes live or work in a zoo? Then this T-shirt is for you!', 20000, 'visit-the-zoo.gif', 'visit-the-zoo-2.gif', 'visit-the-zoo-3.gif'),
('Sambar', 'This handsome Malayan Sambar was a pain in the neck to get to pose like this, and all so you could have this beautiful retro animal T-shirt!', 19000, 'sambar.gif', 'sambar-2.gif', 'sambar-3.gif'),
('Buffalo', 'Of all the critters in our T-shirt zoo, this is one of our most popular. A classic animal T-shirt for an individual like yourself!', 14990, 'buffalo.gif', 'buffalo-2.gif', 'buffalo-3.gif'),
('Mustache Monkey', 'This fellow is more than equipped to hang out with that tail of his, just like you''ll be fit for hanging out with this great animal T-shirt!', 20000, 'mustache-monkey.gif', 'mustache-monkey-2.gif', 'mustache-monkey-3.gif'),
('Colobus', 'Why is he called "Colobus," "the mutilated one"? He doesn''t have a thumb, just four fingers! He is far from handicapped, however; his hands make him the great swinger he is. Speaking of swinging, that''s what you''ll do with this beautiful animal T-shirt!', 17000, 'colobus.gif', 'colobus-2.gif', 'colobus-3.gif'),
('Canada Goose', 'Being on a major flyway for these guys, we know all about these majestic birds. They hang out in large numbers on a lake near our house and fly over constantly. Remember what Frankie Lane said? "I want to go where the wild goose goes!" And when you go, wear this cool Canada goose animal T-shirt.', 15990, 'canada-goose.gif', 'canada-goose-2.gif', 'canada-goose-3.gif'),
('Congo Rhino', 'Among land mammals, this white rhino is surpassed in size only by the elephant. He has a big fan base too, working hard to make sure he sticks around. You''ll be a fan of his, too, when people admire this unique and beautiful T-shirt on you!', 20000, 'congo-rhino.gif', 'congo-rhino-2.gif', 'congo-rhino-3.gif'),
('Equatorial Rhino', 'There''s a lot going on in this frame! A black rhino is checking out that python slithering off into the bush--or is he eyeing you? You can bet all eyes will be on you when you wear this T-shirt!', 19950, 'equatorial-rhino.gif', 'equatorial-rhino-2.gif', 'equatorial-rhino-3.gif'),
('Ethiopian Rhino', 'Another white rhino is honored in this classic design that bespeaks the Africa of the early century. This pointillist and retro T-shirt will definitely turn heads!', 16000, 'ethiopian-rhino.gif', 'ethiopian-rhino-2.gif', 'ethiopian-rhino-3.gif'),
('Dutch Sea Horse', 'I think this T-shirt is destined to be one of our most popular simply because it is one of our most beautiful!', 12500, 'dutch-sea-horse.gif', 'dutch-sea-horse-2.gif', 'dutch-sea-horse-3.gif'),
('Dutch Swans', 'This stamp was designed in the middle of the Nazi occupation, as was the one above. Together they reflect a spirit of beauty that evil could not suppress. Both of these T-shirts will make it impossible to suppress your artistic soul, too!', 21000, 'dutch-swans.gif', 'dutch-swans-2.gif', 'dutch-swans-3.gif'),
('Ethiopian Elephant', 'From the same series as the Ethiopian Rhino and the Ostriches, this stylish elephant T-shirt will mark you as a connoisseur of good taste!', 18990, 'ethiopian-elephant.gif', 'ethiopian-elephant-2.gif', 'ethiopian-elephant-3.gif'),
('Laotian Elephant', 'This working guy is proud to have his own stamp, and now he has his own T-shirt!', 21000, 'laotian-elephant.gif', 'laotian-elephant-2.gif', 'laotian-elephant-3.gif'),
('Liberian Elephant', 'And yet another Jumbo! You need nothing but a big heart to wear this T-shirt (or a big sense of style)!', 22000, 'liberian-elephant.gif', 'liberian-elephant-2.gif', 'liberian-elephant-3.gif'),
('Somali Ostriches', 'Another in an old series of beautiful stamps from Ethiopia. These big birds pack quite a wallop, and so will you when you wear this uniquely retro T-shirt!', 12950, 'somali-ostriches.gif', 'somali-ostriches-2.gif', 'somali-ostriches-3.gif'),
('Tankanyika Giraffe', 'The photographer had to stand on a step ladder for this handsome portrait, but his efforts paid off with an angle we seldom see of this lofty creature. This beautiful retro T-shirt would make him proud!', 15000, 'tankanyika-giraffe.gif', 'tankanyika-giraffe-2.gif', 'tankanyika-giraffe-3.gif'),
('Ifni Fish', 'This beautiful stamp was issued to commemorate National Colonial Stamp Day (you can do that when you have a colony). When you wear this fancy fish T-shirt, your friends will think it''s national T-shirt day!', 14000, 'ifni-fish.gif', 'ifni-fish-2.gif', 'ifni-fish-3.gif'),
('Sea Gull', 'A beautiful stamp from a small enclave in southern Morocco that belonged to Spain until 1969 makes a beautiful bird T-shirt.', 19000, 'sea-gull.gif', 'sea-gull-2.gif', 'sea-gull-3.gif'),
('King Salmon', 'You can fish them and eat them and now you can wear them with this classic animal T-shirt.', 17950, 'king-salmon.gif', 'king-salmon-2.gif', 'king-salmon-3.gif'),
('Laos Bird', 'This fellow is also known as the "White Crested Laughing Thrush." What''s he laughing at? Why, at the joy of being on your T-shirt!', 12000, 'laos-bird.gif', 'laos-bird-2.gif', 'laos-bird-3.gif'),
('Mozambique Lion', 'The Portuguese were too busy to run this colony themselves so they gave the Mozambique Company a charter to do it. I think there must be some pretty curious history related to that (the charter only lasted for 50 years)! If you''re a Leo, or know a Leo, you should seriously consider this T-shirt!', 15990, 'mozambique-lion.gif', 'mozambique-lion-2.gif', 'mozambique-lion-3.gif'),
('Peru Llama', 'This image is nearly 100 years old! Little did this little llama realize that he was going to be made immortal on the Web and on this very unique animal T-shirt (actually, little did he know at all)!', 21500, 'peru-llama.gif', 'peru-llama-2.gif', 'peru-llama-3.gif'),
('Romania Alsatian', 'If you know and love this breed, there''s no reason in the world that you shouldn''t buy this T-shirt right now!', 15950, 'romania-alsatian.gif', 'romania-alsatian-2.gif', 'romania-alsatian-3.gif'),
('Somali Fish', 'This is our most popular fish T-shirt, hands down. It''s a beauty, and if you wear this T-shirt, you''ll be letting the world know you''re a fine catch!', 19950, 'somali-fish.gif', 'somali-fish-2.gif', 'somali-fish-3.gif'),
('Trout', 'This beautiful image will warm the heart of any fisherman! You must know one if you''re not one yourself, so you must buy this T-shirt!', 14000, 'trout.gif', 'trout-2.gif', 'trout-3.gif'),
('Baby Seal', 'Ahhhhhh! This little harp seal would really prefer not to be your coat! But he would like to be your T-shirt!', 21000, 'baby-seal.gif', 'baby-seal-2.gif', 'baby-seal-3.gif'),
('Musk Ox', 'Some critters you just don''t want to fool with, and if I were facing this fellow I''d politely give him the trail! That is, of course, unless I were wearing this T-shirt.', 15500, 'musk-ox.gif', 'musk-ox-2.gif', 'musk-ox-3.gif'),
('Suvla Bay', ' In 1915, Newfoundland sent its Newfoundland Regiment to Suvla Bay in Gallipoli to fight the Turks. This classic image does them honor. Have you ever heard of them? Share the news with this great T-shirt!', 12990, 'suvla-bay.gif', 'suvla-bay-2.gif', 'suvla-bay-3.gif'),
('Caribou', 'There was a time when Newfoundland was a self-governing dominion of the British Empire, so it printed its own postage. The themes are as typically Canadian as can be, however, as shown by this "King of the Wilde" T-shirt!', 21000, 'caribou.gif', 'caribou-2.gif', 'caribou-3.gif'),
('Afghan Flower', 'This beautiful image was issued to celebrate National Teachers Day. Perhaps you know a teacher who would love this T-shirt?', 18500, 'afghan-flower.gif', 'afghan-flower-2.gif', 'afghan-flower-3.gif'),
('Albania Flower', 'Well, these crab apples started out as flowers, so that''s close enough for us! They still make for a uniquely beautiful T-shirt.', 16000, 'albania-flower.gif', 'albania-flower-2.gif', 'albania-flower-3.gif'),
('Austria Flower', 'Have you ever had nasturtiums on your salad? Try it--they''re almost as good as having them on your T-shirt!', 12990, 'austria-flower.gif', 'austria-flower-2.gif', 'austria-flower-3.gif'),
('Bulgarian Flower', 'For your interest (and to impress your friends), this beautiful stamp was issued to honor the George Dimitrov state printing works. You''ll need to know this when you wear the T-shirt.', 16000, 'bulgarian-flower.gif', 'bulgarian-flower-2.gif', 'bulgarian-flower-3.gif'),
('Colombia Flower', 'Celebrating the 75th anniversary of the Universal Postal Union, a date to mark on your calendar and on which to wear this T-shirt!', 14500, 'colombia-flower.gif', 'colombia-flower-2.gif', 'colombia-flower-3.gif'),
('Congo Flower', 'The Congo is not at a loss for beautiful flowers, and we''ve picked a few of them for your T-shirts.', 21000, 'congo-flower.gif', 'congo-flower-2.gif', 'congo-flower-3.gif'),
('Costa Rica Flower', 'This national flower of Costa Rica is one of our most beloved flower T-shirts (you can see one on Jill, above). You will surely stand out in this T-shirt!', 12990, 'costa-rica-flower.gif', 'costa-rica-flower-2.gif', 'costa-rica-flower-3.gif'),
('Gabon Flower', 'The combretum, also known as "jungle weed," is used in China as a cure for opium addiction. Unfortunately, when you wear this T-shirt, others may become hopelessly addicted to you!', 19000, 'gabon-flower.gif', 'gabon-flower-2.gif', 'gabon-flower-3.gif'),
('Ghana Flower', 'This is one of the first gingers to bloom in the spring--just like you when you wear this T-shirt!', 21000, 'ghana-flower.gif', 'ghana-flower-2.gif', 'ghana-flower-3.gif'),
('Israel Flower', 'This plant is native to the rocky and sandy regions of the western United States, so when you come across one, it really stands out. And so will you when you put on this beautiful T-shirt!', 19500, 'israel-flower.gif', 'israel-flower-2.gif', 'israel-flower-3.gif'),
('Poland Flower', 'A beautiful and sunny T-shirt for both spring and summer!', 16950, 'poland-flower.gif', 'poland-flower-2.gif', 'poland-flower-3.gif'),
('Romania Flower', 'Also known as the spring pheasant''s eye, this flower belongs on your T-shirt this summer to help you catch a few eyes.', 12950, 'romania-flower.gif', 'romania-flower-2.gif', 'romania-flower-3.gif'),
('Russia Flower', 'Someone out there who can speak Russian needs to tell me what this plant is. I''ll sell you the T-shirt for $10 if you can!', 21000, 'russia-flower.gif', 'russia-flower-2.gif', 'russia-flower-3.gif'),
('San Marino Flower', '"A white sport coat and a pink carnation, I''m all dressed up for the dance!" Well, how about a white T-shirt and a pink carnation?!', 19950, 'san-marino-flower.gif', 'san-marino-flower-2.gif', 'san-marino-flower-3.gif'),
('Uruguay Flower', 'The Indian Queen Anahi was the ugliest woman ever seen. But instead of living a slave when captured by the Conquistadores, she immolated herself in a fire and was reborn the most beautiful of flowers: the ceibo, national flower of Uruguay. Of course, you won''t need to burn to wear this T-shirt, but you may cause some pretty hot glances to be thrown your way!', 17990, 'uruguay-flower.gif', 'uruguay-flower-2.gif', 'uruguay-flower-3.gif'),
('Snow Deer', 'Tarmo has produced some wonderful Christmas T-shirts for us, and we hope to have many more soon.', 21000, 'snow-deer.gif', 'snow-deer-2.gif', 'snow-deer-3.gif'),
('Holly Cat', 'Few things make a cat happier at Christmas than a tree suddenly appearing in the house!', 15990, 'holly-cat.gif', 'holly-cat-2.gif', 'holly-cat-3.gif'),
('Christmas Seal', 'Is this your grandmother? It could be, you know, and I''d bet she''d recognize the Christmas seal on this cool Christmas T-shirt.', 19990, 'christmas-seal.gif', 'christmas-seal-2.gif', 'christmas-seal-3.gif'),
('Weather Vane', 'This weather vane dates from the 1830''s and is still showing which way the wind blows! Trumpet your arrival with this unique Christmas T-shirt.', 15950, 'weather-vane.gif', 'weather-vane-2.gif', 'weather-vane-3.gif'),
('Mistletoe', 'This well-known parasite and killer of trees was revered by the Druids, who would go out and gather it with great ceremony. Youths would go about with it to announce the new year. Eventually more engaging customs were attached to the strange plant, and we''re here to see that they continue with these cool Christmas T-shirts.', 19000, 'mistletoe.gif', 'mistletoe-2.gif', 'mistletoe-3.gif'),
('Altar Piece', 'This beautiful angel Christmas T-shirt is awaiting the opportunity to adorn your chest!', 20500, 'altar-piece.gif', 'altar-piece-2.gif', 'altar-piece-3.gif'),
('The Three Wise Men', 'This is a classic rendition of one of the season�s most beloved stories, and now showing on a Christmas T-shirt for you!', 12990, 'the-three-wise-men.gif', 'the-three-wise-men-2.gif', 'the-three-wise-men-3.gif'),
('Christmas Tree', 'Can you get more warm and folksy than this classic Christmas T-shirt?', 20000, 'christmas-tree.gif', 'christmas-tree-2.gif', 'christmas-tree-3.gif'),
('Madonna & Child', 'This exquisite image was painted by Filipino Lippi, a 15th century Italian artist. I think he would approve of it on a Going Postal Christmas T-shirt!', 21950, 'madonna-child.gif', 'madonna-child.gif', 'madonna-child-3.gif'),
('The Virgin Mary', 'This stained glass window is found in Glasgow Cathedral, Scotland, and was created by Gabriel Loire of France, one of the most prolific of artists in this medium--and now you can have it on this wonderful Christmas T-shirt.', 16950, 'the-virgin-mary.gif', 'the-virgin-mary-2.gif', 'the-virgin-mary-3.gif'),
('Adoration of the Kings', 'This design is from a miniature in the Evangelistary of Matilda in Nonantola Abbey, from the 12th century. As a Christmas T-shirt, it will cause you to be adored!', 17500, 'adoration-of-the-kings.gif', 'adoration-of-the-kings-2.gif', 'adoration-of-the-kings-3.gif'),
('A Partridge in a Pear Tree', 'The original of this beautiful stamp is by Jamie Wyeth and is in the National Gallery of Art. The next best is on our beautiful Christmas T-shirt!', 14990, 'a-partridge-in-a-pear-tree.gif', 'a-partridge-in-a-pear-tree-2.gif', 'a-partridge-in-a-pear-tree-3.gif'),
('St. Lucy', 'This is a tiny detail of a large work called "Mary, Queen of Heaven," done in 1480 by a Flemish master known only as "The Master of St. Lucy Legend." The original is in a Bruges church. The not-quite-original is on this cool Christmas T-shirt.', 18950, 'st-lucy.gif', 'st-lucy-2.gif', 'st-lucy-3.gif'),
('St. Lucia', 'Saint Lucia''s tradition is an important part of Swedish Christmas, and an important part of that are the candles. Next to the candles in importance is this popular Christmas T-shirt!', 19000, 'st-lucia.gif', 'st-lucia-2.gif', 'st-lucia-3.gif'),
('Swede Santa', 'Santa as a child. You must know a child who would love this cool Christmas T-shirt!?', 21000, 'swede-santa.gif', 'swede-santa-2.gif', 'swede-santa-3.gif'),
('Wreath', 'Hey! I''ve got an idea! Why not buy two of these cool Christmas T-shirts so you can wear one and tack the other one to your door?!', 18990, 'wreath.gif', 'wreath-2.gif', 'wreath-3.gif'),
('Love', 'Here''s a Valentine''s day T-shirt that will let you say it all in just one easy glance--there''s no mistake about it!', 19000, 'love.gif', 'love-2.gif', 'love-3.gif'),
('Birds', 'Is your heart all aflutter? Show it with this T-shirt!', 21000, 'birds.gif', 'birds-2.gif', 'birds-3.gif'),
('Kat Over New Moon', 'Love making you feel lighthearted?', 14990, 'kat-over-new-moon.gif', 'kat-over-new-moon-2.gif', 'kat-over-new-moon-3.gif'),
('Thrilling Love', 'This girl''s got her hockey hunk right where she wants him!', 21000, 'thrilling-love.gif', 'thrilling-love-2.gif', 'thrilling-love-3.gif'),
('The Rapture of Psyche', 'Now we''re getting a bit more serious!', 18950, 'the-rapture-of-psyche.gif', 'the-rapture-of-psyche-2.gif', 'the-rapture-of-psyche-3.gif'),
('The Promise of Spring', 'With Valentine''s Day come, can Spring be far behind?', 21000, 'the-promise-of-spring.gif', 'the-promise-of-spring-2.gif', 'the-promise-of-spring-3.gif');

-- Populate product_category table -OK
INSERT INTO product_category ("product_id", "category_id") VALUES
(1, 1), (2, 1), (3, 1), (4, 1), (5, 1), (6, 1), (7, 1), (8, 1), (9, 1),
(10, 1), (11, 1), (12, 1), (13, 1), (14, 1), (15, 1), (16, 1), (17, 1),
(18, 1), (19, 2), (20, 2), (21, 2), (22, 2), (23, 2), (24, 2), (25, 2),
(26, 2), (27, 2), (28, 2), (29, 3), (30, 3), (31, 3), (32, 3), (33, 3),
(34, 3), (35, 3), (36, 4), (37, 4), (38, 4), (39, 4), (40, 4), (41, 4),
(42, 4), (43, 4), (44, 4), (45, 4), (46, 4), (47, 4), (48, 4), (49, 4),
(50, 4), (51, 4), (52, 4), (53, 4), (54, 4), (55, 4), (56, 4), (57, 4),
(58, 4), (59, 4), (60, 4), (61, 4), (62, 4), (63, 4), (64, 4), (81, 4),
(97, 4), (98, 4), (65, 5), (66, 5), (67, 5), (68, 5), (69, 5), (70, 5),
(71, 5), (72, 5), (73, 5), (74, 5), (75, 5), (76, 5), (77, 5), (78, 5),
(79, 5), (80, 6), (81, 6), (82, 6), (83, 6), (84, 6), (85, 6), (86, 6),
(87, 6), (88, 6), (89, 6), (90, 6), (91, 6), (92, 6), (93, 6), (94, 6),
(95, 6), (96, 7), (97, 7), (98, 7), (99, 7), (100, 7), (101, 7);

-- Populate attribute table -OK
INSERT INTO attribute ("name") VALUES
('Size'), ('Color');

-- Populate attribute_value table -OK
INSERT INTO attribute_value ("attribute_id", "value") VALUES
(1, 'S'), (1, 'M'), (1, 'L'), (1, 'XL'), (1, 'XXL'),
(2, 'White'),  (2, 'Black'), (2, 'Red'), (2, 'Orange'),
(2, 'Yellow'), (2, 'Green'), (2, 'Blue'),
(2, 'Indigo'), (2, 'Purple');

-- Populate product_attribute table -OK
INSERT INTO product_attribute ("product_id", "attribute_id")
VALUES (1,1),(1,2),(2,1),(2,2),(3,1),(3,2),(4,1),(4,2),(5,1),(5,2),
       (6,1),(6,2),(7,1),(7,2),(8,1),(8,2),(9,1),(9,2),(10,1),(10,2),
       (11,1),(11,2),(12,1),(12,2),(13,1),(13,2),(14,1),(14,2),(15,1),(15,2),
       (16,1),(16,2),(17,1),(17,2),(18,1),(18,2),(19,1),(19,2),(20,1),(20,2),
       (21,1),(21,2),(22,1),(22,2),(23,1),(23,2),(24,1),(24,2),(25,1),(25,2),
       (26,1),(26,2),(27,1),(27,2),(28,1),(28,2),(29,1),(29,2),(30,1),(30,2),
       (31,1),(31,2),(32,1),(32,2),(33,1),(33,2),(34,1),(34,2),(35,1),(35,2),
       (36,1),(36,2),(37,1),(37,2),(38,1),(38,2),(39,1),(39,2),(40,1),(40,2),
       (41,1),(42,2),(43,1),(43,2),(44,1),(44,2),(45,1),(45,2),(46,1),(46,2),
       (47,1),(47,2),(48,1),(48,2),(49,1),(49,2),(50,1),(50,2),(51,1),(51,2),
       (52,1),(52,2),(53,1),(53,2),(54,1),(54,2),(55,1),(55,2),(56,1),(56,2),
       (57,1),(57,2),(58,1),(58,2),(59,1),(59,2),(60,1),(60,2),(61,1),(61,2),
       (62,1),(62,2),(63,1),(63,2),(64,1),(64,2),(65,1),(65,2),(66,1),(66,2),
       (67,1),(67,2),(68,1),(68,2),(69,1),(69,2),(70,1),(70,2),(71,1),(71,2),
       (72,1),(72,2),(73,1),(73,2),(74,1),(74,2),(75,1),(75,2),(76,1),(76,2),
       (77,1),(77,2),(78,1),(78,2),(79,1),(79,2),(80,1),(80,2),(81,1),(81,2),
       (82,1),(82,2),(83,1),(83,2),(84,1),(84,2),(85,1),(85,2),(86,1),(86,2),
       (87,1),(87,2),(88,1),(88,2),(89,1),(89,2),(90,1),(90,2),(91,1),(91,2),
       (92,1),(92,2),(93,1),(93,2),(94,1),(94,2),(95,1),(95,2),(96,1),(96,2),
       (97,1),(97,2),(98,1),(98,2),(99,1),(99,2),(100,1),(100,2),(101,1),(101,2);

-- Populate shipping_region table -OK
INSERT INTO shipping_region ("shipping_regions") VALUES
('Please Select') , ('US / Canada'),
('Europe'),         ('Rest of World');

-- Populate shipping table - OK
INSERT INTO shipping ("shipping_type",
                        "shipping_cost", "shipping_region_id") VALUES
('Next Day Delivery ($20)', 2000, 2),
('3-4 Days ($10)',          1000, 2),
('7 Days ($5)',              500, 2),
('By air (7 days, $25)',    2500, 3),
('By sea (28 days, $10)',   1000, 3),
('By air (10 days, $35)',   3500, 4),
('By sea (28 days, $30)',   3000, 4);



-- Queries

-- Create catalog_get_categories_list - OK
SELECT   id, name
FROM     category
ORDER BY id;


-- Create catalog_get_category_details - OK
SELECT name, description
FROM   category
WHERE  id = ?;

-- Create catalog_count_products_in_category - OK
SELECT     COUNT(*) AS categories_count
FROM       product p
               INNER JOIN product_category pc
                          ON p.id = pc.product_id
WHERE      pc.category_id = ?;

-- Create catalog_get_products_in_category - OK
SELECT     p.id, p.name, description,
           p.price, p.image, p.image_2, p.image_3
FROM       product p
               INNER JOIN product_category pc
                          ON p.id = pc.product_id
WHERE      pc.category_id = ?;


-- Create catalog_count_products_on_catalog - OK
SELECT COUNT(*) AS products_on_catalog_count
FROM   product;

-- Create catalog_get_products_on_catalog - OK
SELECT   id, name, description,
         price, image, image_2, image_3
FROM     product;


-- Create catalog_get_product_details  -
SELECT id, name, description,
       price, image, image_2, image_3
FROM   product
WHERE  id = ?;

-- Create catalog_get_product_locations - OK
SELECT c.id, c.name AS category_name
FROM   category c
WHERE  c.id IN
       (SELECT category_id
        FROM   product_category
        WHERE  product_id = ?);


-- Create catalog_get_product_attributes  - OK
SELECT     a.name AS attribute_name,
           av.id, av.value AS attribute_value
FROM       attribute_value av
               INNER JOIN attribute a
                          ON av.attribute_id = a.id
WHERE      av.id IN
           (SELECT attribute_id
            FROM   product_attribute
            WHERE  product_id = ?)
ORDER BY   a.name;


-- Create catalog_get_category_name  - OK
SELECT name FROM category WHERE id = ?;


-- Create catalog_get_product_name - OK
SELECT name FROM product WHERE id = ?;

-- Create catalog_count_search_result - OK
SELECT   count(*)
FROM     product
WHERE    description ILIKE '%flow%';


-- Create catalog_add_category  - OK
INSERT INTO category (name, description)
VALUES (?, ?);

-- Create catalog_update_category - OK
UPDATE category
SET    name = ?, description = ?
WHERE  id = ?;


-- Create catalog_delete_category - OK

DELETE FROM category WHERE id = ?;


-- Create catalog_get_attributes - Ok
SELECT id, name FROM attribute ORDER BY id;


-- Create catalog_add_attribute - OK
INSERT INTO attribute (name) VALUES (?);


-- Create catalog_update_attribute - OK
UPDATE attribute SET name = ? WHERE id = ?;


-- Create catalog_delete_attribute - OK
DELETE FROM attribute WHERE id = ?;


-- Create catalog_get_attribute_details - OK
SELECT id, name
FROM   attribute
WHERE  id = ?;


-- Create catalog_get_attribute_values - OK
SELECT   id, value
FROM     attribute_value
WHERE    attribute_id = ?
ORDER BY attribute_id;


-- Create catalog_add_attribute_value - OK
INSERT INTO attribute_value (attribute_id, value)
VALUES (?, ?);


-- Create catalog_update_attribute_value - OK
UPDATE attribute_value
SET    value = ?
WHERE  id = ?;


-- Create catalog_delete_attribute_value - OK
DELETE FROM attribute_value WHERE id = ?;


-- Create catalog_get_category_products - OK
SELECT     p.id, p.name, p.description, p.price,
           p.image, p.image_2, p.image_3
FROM       product p
        INNER JOIN product_category pc
                          ON p.id = pc.product_id
WHERE      pc.category_id = ?
ORDER BY   p.id;


-- Create catalog_add_product_to_category
DO $$
    DECLARE last_product_id integer;
    BEGIN
        INSERT INTO product (name, description, price, image, image_2, image_3)
        VALUES (?, ?, ?, ?, ?,?) RETURNING id INTO last_product_id;
        INSERT INTO product_category (product_id, category_id)
        VALUES (last_product_id, ?);
END $$;


-- Create catalog_update_product stored procedure
CREATE PROCEDURE catalog_update_product(IN inProductId INT,
                                        IN inName VARCHAR(100), IN inDescription VARCHAR(1000),
                                        IN inPrice DECIMAL(10, 2), IN inDiscountedPrice DECIMAL(10, 2))
BEGIN
UPDATE product
SET    name = inName, description = inDescription, price = inPrice,
       discounted_price = inDiscountedPrice
WHERE  product_id = inProductId;
END$$

-- Create catalog_remove_product_from_category stored procedure
CREATE PROCEDURE catalog_remove_product_from_category(
    IN inProductId INT, IN inCategoryId INT)
BEGIN
  DECLARE productCategoryRowsCount INT;

SELECT count(*)
FROM   product_category
WHERE  product_id = inProductId
    INTO   productCategoryRowsCount;

IF productCategoryRowsCount = 1 THEN
    CALL catalog_delete_product(inProductId);

SELECT 0;
ELSE
DELETE FROM product_category
WHERE  category_id = inCategoryId AND product_id = inProductId;

SELECT 1;
END IF;
END$$

-- Create catalog_get_categories stored procedure
CREATE PROCEDURE catalog_get_categories()
BEGIN
SELECT   category_id, name, description
FROM     category
ORDER BY category_id;
END$$

-- Create catalog_get_product_info stored procedure
CREATE PROCEDURE catalog_get_product_info(IN inProductId INT)
BEGIN
SELECT product_id, name, description, price, discounted_price,
       image, image_2, thumbnail, display
FROM   product
WHERE  product_id = inProductId;
END$$

-- Create catalog_get_categories_for_product stored procedure
CREATE PROCEDURE catalog_get_categories_for_product(IN inProductId INT)
BEGIN
SELECT   c.category_id, c.department_id, c.name
FROM     category c
             JOIN     product_category pc
                      ON c.category_id = pc.category_id
WHERE    pc.product_id = inProductId
ORDER BY category_id;
END$$

-- Create catalog_set_product_display_option stored procedure
CREATE PROCEDURE catalog_set_product_display_option(
    IN inProductId INT, IN inDisplay SMALLINT)
BEGIN
UPDATE product SET display = inDisplay WHERE product_id = inProductId;
END$$

-- Create catalog_assign_product_to_category stored procedure
CREATE PROCEDURE catalog_assign_product_to_category(
    IN inProductId INT, IN inCategoryId INT)
BEGIN
INSERT INTO product_category (product_id, category_id)
VALUES (inProductId, inCategoryId);
END$$

-- Create catalog_move_product_to_category stored procedure
CREATE PROCEDURE catalog_move_product_to_category(IN inProductId INT,
                                                  IN inSourceCategoryId INT, IN inTargetCategoryId INT)
BEGIN
UPDATE product_category
SET    category_id = inTargetCategoryId
WHERE  product_id = inProductId
  AND category_id = inSourceCategoryId;
END$$

-- Create catalog_get_attributes_not_assigned_to_product stored procedure
CREATE PROCEDURE catalog_get_attributes_not_assigned_to_product(
    IN inProductId INT)
BEGIN
SELECT     a.name AS attribute_name,
           av.attribute_value_id, av.value AS attribute_value
FROM       attribute_value av
               INNER JOIN attribute a
                          ON av.attribute_id = a.attribute_id
WHERE      av.attribute_value_id NOT IN
           (SELECT attribute_value_id
            FROM   product_attribute
            WHERE  product_id = inProductId)
ORDER BY   attribute_name, av.attribute_value_id;
END$$

-- Create catalog_assign_attribute_value_to_product stored procedure
CREATE PROCEDURE catalog_assign_attribute_value_to_product(
    IN inProductId INT, IN inAttributeValueId INT)
BEGIN
INSERT INTO product_attribute (product_id, attribute_value_id)
VALUES (inProductId, inAttributeValueId);
END$$

-- Create catalog_remove_product_attribute_value stored procedure
CREATE PROCEDURE catalog_remove_product_attribute_value(
    IN inProductId INT, IN inAttributeValueId INT)
BEGIN
DELETE FROM product_attribute
WHERE       product_id = inProductId AND
        attribute_value_id = inAttributeValueId;
END$$

-- Create catalog_set_image stored procedure
CREATE PROCEDURE catalog_set_image(
    IN inProductId INT, IN inImage VARCHAR(150))
BEGIN
UPDATE product SET image = inImage WHERE product_id = inProductId;
END$$

-- Create catalog_set_image_2 stored procedure
CREATE PROCEDURE catalog_set_image_2(
    IN inProductId INT, IN inImage VARCHAR(150))
BEGIN
UPDATE product SET image_2 = inImage WHERE product_id = inProductId;
END$$

-- Create catalog_set_thumbnail stored procedure
CREATE PROCEDURE catalog_set_thumbnail(
    IN inProductId INT, IN inThumbnail VARCHAR(150))
BEGIN
UPDATE product
SET    thumbnail = inThumbnail
WHERE  product_id = inProductId;
END$$

-- Create shopping_cart_add_product stored procedure
CREATE PROCEDURE shopping_cart_add_product(IN inCartId CHAR(32),
                                           IN inProductId INT, IN inAttributes VARCHAR(1000))
BEGIN
  DECLARE productQuantity INT;

  -- Obtain current shopping cart quantity for the product
SELECT quantity
FROM   shopping_cart
WHERE  cart_id = inCartId
  AND product_id = inProductId
  AND attributes = inAttributes
    INTO   productQuantity;

-- Create new shopping cart record, or increase quantity of existing record
IF productQuantity IS NULL THEN
    INSERT INTO shopping_cart(item_id, cart_id, product_id, attributes,
                              quantity, added_on)
           VALUES (UUID(), inCartId, inProductId, inAttributes, 1, NOW());
ELSE
UPDATE shopping_cart
SET    quantity = quantity + 1, buy_now = true
WHERE  cart_id = inCartId
  AND product_id = inProductId
  AND attributes = inAttributes;
END IF;
END$$

-- Create shopping_cart_update_product stored procedure
CREATE PROCEDURE shopping_cart_update(IN inItemId INT, IN inQuantity INT)
BEGIN
  IF inQuantity > 0 THEN
UPDATE shopping_cart
SET    quantity = inQuantity, added_on = NOW()
WHERE  item_id = inItemId;
ELSE
    CALL shopping_cart_remove_product(inItemId);
END IF;
END$$

-- Create shopping_cart_remove_product stored procedure
CREATE PROCEDURE shopping_cart_remove_product(IN inItemId INT)
BEGIN
DELETE FROM shopping_cart WHERE item_id = inItemId;
END$$

-- Create shopping_cart_get_products stored procedure
CREATE PROCEDURE shopping_cart_get_products(IN inCartId CHAR(32))
BEGIN
SELECT     sc.item_id, p.name, sc.attributes,
           COALESCE(NULLIF(p.discounted_price, 0), p.price) AS price,
           sc.quantity,
           COALESCE(NULLIF(p.discounted_price, 0),
                    p.price) * sc.quantity AS subtotal
FROM       shopping_cart sc
               INNER JOIN product p
                          ON sc.product_id = p.product_id
WHERE      sc.cart_id = inCartId AND sc.buy_now;
END$$

-- Create shopping_cart_get_saved_products stored procedure
CREATE PROCEDURE shopping_cart_get_saved_products(IN inCartId CHAR(32))
BEGIN
SELECT     sc.item_id, p.name, sc.attributes,
           COALESCE(NULLIF(p.discounted_price, 0), p.price) AS price
FROM       shopping_cart sc
               INNER JOIN product p
                          ON sc.product_id = p.product_id
WHERE      sc.cart_id = inCartId AND NOT sc.buy_now;
END$$

-- Create shopping_cart_get_total_amount stored procedure
CREATE PROCEDURE shopping_cart_get_total_amount(IN inCartId CHAR(32))
BEGIN
SELECT     SUM(COALESCE(NULLIF(p.discounted_price, 0), p.price)
    * sc.quantity) AS total_amount
FROM       shopping_cart sc
               INNER JOIN product p
                          ON sc.product_id = p.product_id
WHERE      sc.cart_id = inCartId AND sc.buy_now;
END$$

-- Create shopping_cart_save_product_for_later stored procedure
CREATE PROCEDURE shopping_cart_save_product_for_later(IN inItemId INT)
BEGIN
UPDATE shopping_cart
SET    buy_now = false, quantity = 1
WHERE  item_id = inItemId;
END$$

-- Create shopping_cart_move_product_to_cart stored procedure
CREATE PROCEDURE shopping_cart_move_product_to_cart(IN inItemId INT)
BEGIN
UPDATE shopping_cart
SET    buy_now = true, added_on = NOW()
WHERE  item_id = inItemId;
END$$

-- Create catalog_delete_product stored procedure
CREATE PROCEDURE catalog_delete_product(IN inProductId INT)
BEGIN
DELETE FROM product_attribute WHERE product_id = inProductId;
DELETE FROM product_category WHERE product_id = inProductId;
DELETE FROM shopping_cart WHERE product_id = inProductId;
DELETE FROM product WHERE product_id = inProductId;
END$$

-- Create shopping_cart_count_old_carts stored procedure
CREATE PROCEDURE shopping_cart_count_old_carts(IN inDays INT)
BEGIN
SELECT COUNT(cart_id) AS old_shopping_carts_count
FROM   (SELECT   cart_id
        FROM     shopping_cart
        GROUP BY cart_id
        HAVING   DATE_SUB(NOW(), INTERVAL inDays DAY) >= MAX(added_on))
           AS old_carts;
END$$

-- Create shopping_cart_delete_old_carts stored procedure
CREATE PROCEDURE shopping_cart_delete_old_carts(IN inDays INT)
BEGIN
DELETE FROM shopping_cart
WHERE  cart_id IN
       (SELECT cart_id
        FROM   (SELECT   cart_id
                FROM     shopping_cart
                GROUP BY cart_id
                HAVING   DATE_SUB(NOW(), INTERVAL inDays DAY) >=
                         MAX(added_on))
                   AS sc);
END$$

-- Create shopping_cart_empty stored procedure
CREATE PROCEDURE shopping_cart_empty(IN inCartId CHAR(32))
BEGIN
DELETE FROM shopping_cart WHERE cart_id = inCartId;
END$$

-- Create orders_get_order_details stored procedure
CREATE PROCEDURE orders_get_order_details(IN inOrderId INT)
BEGIN
SELECT order_id, product_id, attributes, product_name,
       quantity, unit_cost, (quantity * unit_cost) AS subtotal
FROM   order_detail
WHERE  order_id = inOrderId;
END$$

-- Create catalog_get_recommendations stored procedure
CREATE PROCEDURE catalog_get_recommendations(
    IN inProductId INT, IN inShortProductDescriptionLength INT)
BEGIN
PREPARE statement FROM
    "SELECT   od2.product_id, od2.product_name,
              IF(LENGTH(p.description) <= ?, p.description,
                 CONCAT(LEFT(p.description, ?), '...')) AS description
     FROM     order_detail od1
     JOIN     order_detail od2 ON od1.order_id = od2.order_id
     JOIN     product p ON od2.product_id = p.product_id
     WHERE    od1.product_id = ? AND
              od2.product_id != ?
     GROUP BY od2.product_id
     ORDER BY COUNT(od2.product_id) DESC
     LIMIT 5";

SET @p1 = inShortProductDescriptionLength;
  SET @p2 = inProductId;

EXECUTE statement USING @p1, @p1, @p2, @p2;
END$$

-- Create shopping_cart_get_recommendations stored procedure
CREATE PROCEDURE shopping_cart_get_recommendations(
    IN inCartId CHAR(32), IN inShortProductDescriptionLength INT)
BEGIN
PREPARE statement FROM
    "-- Returns the products that exist in a list of orders
     SELECT   od1.product_id, od1.product_name,
              IF(LENGTH(p.description) <= ?, p.description,
                 CONCAT(LEFT(p.description, ?), '...')) AS description
     FROM     order_detail od1
     JOIN     order_detail od2
                ON od1.order_id = od2.order_id
     JOIN     product p
                ON od1.product_id = p.product_id
     JOIN     shopping_cart
                ON od2.product_id = shopping_cart.product_id
     WHERE    shopping_cart.cart_id = ?
              -- Must not include products that already exist
              -- in the visitor's cart
              AND od1.product_id NOT IN
              (-- Returns the products in the specified
               -- shopping cart
               SELECT product_id
               FROM   shopping_cart
               WHERE  cart_id = ?)
     -- Group the product_id so we can calculate the rank
     GROUP BY od1.product_id
     -- Order descending by rank
     ORDER BY COUNT(od1.product_id) DESC
     LIMIT    5";

SET @p1 = inShortProductDescriptionLength;
  SET @p2 = inCartId;

EXECUTE statement USING @p1, @p1, @p2, @p2;
END$$

-- Create customer_get_login_info stored procedure
CREATE PROCEDURE customer_get_login_info(IN inEmail VARCHAR(100))
BEGIN
SELECT customer_id, password FROM customer WHERE email = inEmail;
END$$

-- Create customer_add stored procedure
CREATE PROCEDURE customer_add(IN inName VARCHAR(50),
                              IN inEmail VARCHAR(100), IN inPassword VARCHAR(50))
BEGIN
INSERT INTO customer (name, email, password)
VALUES (inName, inEmail, inPassword);

SELECT LAST_INSERT_ID();
END$$

-- Create customer_get_customer stored procedure
CREATE PROCEDURE customer_get_customer(IN inCustomerId INT)
BEGIN
SELECT customer_id, name, email, password, credit_card,
       address_1, address_2, city, region, postal_code, country,
       shipping_region_id, day_phone, eve_phone, mob_phone
FROM   customer
WHERE  customer_id = inCustomerId;
END$$

-- Create customer_update_account stored procedure
CREATE PROCEDURE customer_update_account(IN inCustomerId INT,
                                         IN inName VARCHAR(50), IN inEmail VARCHAR(100),
                                         IN inPassword VARCHAR(50), IN inDayPhone VARCHAR(100),
                                         IN inEvePhone VARCHAR(100), IN inMobPhone VARCHAR(100))
BEGIN
UPDATE customer
SET    name = inName, email = inEmail,
       password = inPassword, day_phone = inDayPhone,
       eve_phone = inEvePhone, mob_phone = inMobPhone
WHERE  customer_id = inCustomerId;
END$$

-- Create customer_update_credit_card stored procedure
CREATE PROCEDURE customer_update_credit_card(
    IN inCustomerId INT, IN inCreditCard TEXT)
BEGIN
UPDATE customer
SET    credit_card = inCreditCard
WHERE  customer_id = inCustomerId;
END$$

-- Create customer_get_shipping_regions stored procedure
CREATE PROCEDURE customer_get_shipping_regions()
BEGIN
SELECT shipping_region_id, shipping_region FROM shipping_region;
END$$

-- Create customer_update_address stored procedure
CREATE PROCEDURE customer_update_address(IN inCustomerId INT,
                                         IN inAddress1 VARCHAR(100), IN inAddress2 VARCHAR(100),
                                         IN inCity VARCHAR(100), IN inRegion VARCHAR(100),
                                         IN inPostalCode VARCHAR(100), IN inCountry VARCHAR(100),
                                         IN inShippingRegionId INT)
BEGIN
UPDATE customer
SET    address_1 = inAddress1, address_2 = inAddress2, city = inCity,
       region = inRegion, postal_code = inPostalCode,
       country = inCountry, shipping_region_id = inShippingRegionId
WHERE  customer_id = inCustomerId;
END$$

-- Create orders_get_most_recent_orders stored procedure
CREATE PROCEDURE orders_get_most_recent_orders(IN inHowMany INT)
BEGIN
PREPARE statement FROM
    "SELECT     o.order_id, o.total_amount, o.created_on,
                o.shipped_on, o.status, c.name
     FROM       orders o
     INNER JOIN customer c
                  ON o.customer_id = c.customer_id
     ORDER BY   o.created_on DESC
     LIMIT      ?";

SET @p1 = inHowMany;

EXECUTE statement USING @p1;
END$$

-- Create orders_get_orders_between_dates stored procedure
CREATE PROCEDURE orders_get_orders_between_dates(
    IN inStartDate DATETIME, IN inEndDate DATETIME)
BEGIN
SELECT     o.order_id, o.total_amount, o.created_on,
           o.shipped_on, o.status, c.name
FROM       orders o
               INNER JOIN customer c
                          ON o.customer_id = c.customer_id
WHERE      o.created_on >= inStartDate AND o.created_on <= inEndDate
ORDER BY   o.created_on DESC;
END$$

-- Create orders_get_orders_by_status stored procedure
CREATE PROCEDURE orders_get_orders_by_status(IN inStatus INT)
BEGIN
SELECT     o.order_id, o.total_amount, o.created_on,
           o.shipped_on, o.status, c.name
FROM       orders o
               INNER JOIN customer c
                          ON o.customer_id = c.customer_id
WHERE      o.status = inStatus
ORDER BY   o.created_on DESC;
END$$

-- Create orders_get_by_customer_id stored procedure
CREATE PROCEDURE orders_get_by_customer_id(IN inCustomerId INT)
BEGIN
SELECT     o.order_id, o.total_amount, o.created_on,
           o.shipped_on, o.status, c.name
FROM       orders o
               INNER JOIN customer c
                          ON o.customer_id = c.customer_id
WHERE      o.customer_id = inCustomerId
ORDER BY   o.created_on DESC;
END$$

-- Create orders_get_order_short_details stored procedure
CREATE PROCEDURE orders_get_order_short_details(IN inOrderId INT)
BEGIN
SELECT      o.order_id, o.total_amount, o.created_on,
            o.shipped_on, o.status, c.name
FROM        orders o
                INNER JOIN  customer c
                            ON o.customer_id = c.customer_id
WHERE       o.order_id = inOrderId;
END$$

-- Create customer_get_customers_list stored procedure
CREATE PROCEDURE customer_get_customers_list()
BEGIN
SELECT customer_id, name FROM customer ORDER BY name ASC;
END$$

-- Create shopping_cart_create_order stored procedure
CREATE PROCEDURE shopping_cart_create_order(IN inCartId CHAR(32),
                                            IN inCustomerId INT, IN inShippingId INT, IN inTaxId INT)
BEGIN
  DECLARE orderId INT;

  -- Insert a new record into orders and obtain the new order ID
INSERT INTO orders (created_on, customer_id, shipping_id, tax_id) VALUES
(NOW(), inCustomerId, inShippingId, inTaxId);
-- Obtain the new Order ID
SELECT LAST_INSERT_ID() INTO orderId;

-- Insert order details in order_detail table
INSERT INTO order_detail (order_id, product_id, attributes,
                          product_name, quantity, unit_cost)
SELECT      orderId, p.product_id, sc.attributes, p.name, sc.quantity,
            COALESCE(NULLIF(p.discounted_price, 0), p.price) AS unit_cost
FROM        shopping_cart sc
                INNER JOIN  product p
                            ON sc.product_id = p.product_id
WHERE       sc.cart_id = inCartId AND sc.buy_now;

-- Save the order's total amount
UPDATE orders
SET    total_amount = (SELECT SUM(unit_cost * quantity)
                       FROM   order_detail
                       WHERE  order_id = orderId)
WHERE  order_id = orderId;

-- Clear the shopping cart
CALL shopping_cart_empty(inCartId);

-- Return the Order ID
SELECT orderId;
END$$

-- Create orders_get_order_info stored procedure
CREATE PROCEDURE orders_get_order_info(IN inOrderId INT)
BEGIN
SELECT     o.order_id, o.total_amount, o.created_on, o.shipped_on,
           o.status, o.comments, o.customer_id, o.auth_code,
           o.reference, o.shipping_id, s.shipping_type, s.shipping_cost,
           o.tax_id, t.tax_type, t.tax_percentage
FROM       orders o
               INNER JOIN tax t
                          ON t.tax_id = o.tax_id
               INNER JOIN shipping s
                          ON s.shipping_id = o.shipping_id
WHERE      o.order_id = inOrderId;
END$$

-- Create orders_get_shipping_info stored procedure
CREATE PROCEDURE orders_get_shipping_info(IN inShippingRegionId INT)
BEGIN
SELECT shipping_id, shipping_type, shipping_cost, shipping_region_id
FROM   shipping
WHERE  shipping_region_id = inShippingRegionId;
END$$

-- Create orders_create_audit stored procedure
CREATE PROCEDURE orders_create_audit(IN inOrderId INT,
                                     IN inMessage TEXT, IN inCode INT)
BEGIN
INSERT INTO audit (order_id, created_on, message, code)
VALUES (inOrderId, NOW(), inMessage, inCode);
END$$

-- Create orders_update_status stored procedure
CREATE PROCEDURE orders_update_status(IN inOrderId INT, IN inStatus INT)
BEGIN
UPDATE orders SET status = inStatus WHERE order_id = inOrderId;
END$$

-- Create orders_set_auth_code stored procedure
CREATE PROCEDURE orders_set_auth_code(IN inOrderId INT,
                                      IN inAuthCode VARCHAR(50), IN inReference VARCHAR(50))
BEGIN
UPDATE orders
SET    auth_code = inAuthCode, reference = inReference
WHERE  order_id = inOrderId;
END$$

-- Create orders_set_date_shipped stored procedure
CREATE PROCEDURE orders_set_date_shipped(IN inOrderId INT)
BEGIN
UPDATE orders SET shipped_on = NOW() WHERE order_id = inOrderId;
END$$

-- Create orders_update_order stored procedure
CREATE PROCEDURE orders_update_order(IN inOrderId INT, IN inStatus INT,
                                     IN inComments VARCHAR(255), IN inAuthCode VARCHAR(50),
                                     IN inReference VARCHAR(50))
BEGIN
  DECLARE currentDateShipped DATETIME;

SELECT shipped_on
FROM   orders
WHERE  order_id = inOrderId
    INTO   currentDateShipped;

UPDATE orders
SET    status = inStatus, comments = inComments,
       auth_code = inAuthCode, reference = inReference
WHERE  order_id = inOrderId;

IF inStatus < 7 AND currentDateShipped IS NOT NULL THEN
UPDATE orders SET shipped_on = NULL WHERE order_id = inOrderId;
ELSEIF inStatus > 6 AND currentDateShipped IS NULL THEN
UPDATE orders SET shipped_on = NOW() WHERE order_id = inOrderId;
END IF;
END$$

-- Create orders_get_audit_trail stored procedure
CREATE PROCEDURE orders_get_audit_trail(IN inOrderId INT)
BEGIN
SELECT audit_id, order_id, created_on, message, code
FROM   audit
WHERE  order_id = inOrderId;
END$$

-- Create catalog_get_product_reviews stored procedure
CREATE PROCEDURE catalog_get_product_reviews(IN inProductId INT)
BEGIN
SELECT     c.name, r.review, r.rating, r.created_on
FROM       review r
               INNER JOIN customer c
                          ON c.customer_id = r.customer_id
WHERE      r.product_id = inProductId
ORDER BY   r.created_on DESC;
END$$

-- Create catalog_create_product_review stored procedure
CREATE PROCEDURE catalog_create_product_review(IN inCustomerId INT,
                                               IN inProductId INT, IN inReview TEXT, IN inRating SMALLINT)
BEGIN
INSERT INTO review (customer_id, product_id, review, rating, created_on)
VALUES (inCustomerId, inProductId, inReview, inRating, NOW());
END$$

-- Change back DELIMITER to ;
DELIMITER ;
