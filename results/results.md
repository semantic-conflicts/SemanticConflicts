# Test Suite Dataset

Here you can find the list of changes on same declarations we analyzed in our study. 
Each change is represented as a row in the table bellow. 
<ul>
<li> In column <b>Semantic Conflict</b>, we report whether the change represents a semantic conflict based on our notion of local interference (manual analysis).</li>
<li> In column <b>Detected Semantic Conflict</b>, we report whether a semantic conflict was detected by our study (generated test tools with code transformations). </li>
<li> In columns <b>Test Suites for Original Version</b> and <b>Test Suites for Transformed Version</b>, you can find the generates test suites for the original and transformed versions, respectivelly. </li>
</ul>
<a href="https://semantic-conflicts.github.io/SemanticConflicts/">Return to main page</a>


<a href="https://github.com/semantic-conflicts/SemanticConflicts/tree/master/results/detected-cases.csv">Here</a> you can find the set of test cases that detected a semantic conflict.
<a href="https://github.com/semantic-conflicts/SemanticConflicts/tree/master/results/sample-semantic-conflicts.csv">Here</a> you can find further information regarding our sample (projects, merge scenarios, and changed classes).

<table class="table table-bordered table-hover table-condensed">
<thead><tr><th title="Field #1">Project</th>
<th title="Field #2">Merge Commit</th>
<th title="Field #4">Semantic Conflict</th>
<th title="Field #5">Detected Semantic Conflict</th>
<th title="Field #6">Original Version</th>
<th title="Field #7">Transformed Version</th>
</tr></thead>
<tbody><tr>
<td>Apache/Storm</td>
<td>ad2be678831b3b060229fd936e3908110162b7ac</td>
<td>YES</td>
<td>YES</td>
<td><a href="https://github.com/semantic-conflicts/SemanticConflicts/tree/master/results/storm/ad2be678831b3b060229fd936e3908110162b7ac/original">Here</a></td>
<td><a href="https://github.com/semantic-conflicts/SemanticConflicts/tree/master/results/storm/ad2be678831b3b060229fd936e3908110162b7ac/transformed">Here</a></td>
</tr>
<tr>
<td>antlr4/antlr4</td>
<td>69ff2669eec265e25721dbc27cb00f6c381d0b41</td>
<td>YES</td>
<td>YES</td>
<td><a href="https://github.com/semantic-conflicts/SemanticConflicts/tree/master/results/antlr4/69ff2669eec265e25721dbc27cb00f6c381d0b41/Python2Target/original">Here</a></td>
<td><a href="https://github.com/semantic-conflicts/SemanticConflicts/tree/master/results/antlr4/69ff2669eec265e25721dbc27cb00f6c381d0b41/Python2Target/transformed">Here</a></td>
</tr>
<tr>
<td>antlr4/antlr4</td>
<td>69ff2669eec265e25721dbc27cb00f6c381d0b41</td>
<td>YES</td>
<td>YES</td>
<td><a href="https://github.com/semantic-conflicts/SemanticConflicts/tree/master/results/antlr4/69ff2669eec265e25721dbc27cb00f6c381d0b41/Python3Target/original">Here</a></td>
<td><a href="https://github.com/semantic-conflicts/SemanticConflicts/tree/master/results/antlr4/69ff2669eec265e25721dbc27cb00f6c381d0b41/Python3Target/transformed">Here</a></td>
</tr>
<tr>
<td>CloudSlang/cloud-slang</td>
<td>20bac30d9bd76569aa6a4fa1e8261c1a9b5e6f76</td>
<td>YES</td>
<td>NO</td>
<td><a href="https://github.com/semantic-conflicts/SemanticConflicts/tree/master/results/cloud-slang/20bac30d9bd76569aa6a4fa1e8261c1a9b5e6f76/original">Here</a></td>
<td><a href="https://github.com/semantic-conflicts/SemanticConflicts/tree/master/results/cloud-slang/20bac30d9bd76569aa6a4fa1e8261c1a9b5e6f76/transformed">Here</a></td>
</tr>
<tr>
<td>Apache/Storm</td>
<td>bd1f5c54752f67b484a83c26667331234234d3a3</td>
<td>NO</td>
<td>NO</td>
<td><a href="https://github.com/semantic-conflicts/SemanticConflicts/tree/master/results/storm/bd1f5c54752f67b484a83c26667331234234d3a3/original">Here</a></td>
<td><a href="https://github.com/semantic-conflicts/SemanticConflicts/tree/master/results/storm/bd1f5c54752f67b484a83c26667331234234d3a3/transformed">Here</a></td>
</tr>
<tr>
<td>Unclebob/fitnesse</td>
<td>4d9ba9d221d879507440feb084fa7521b95111ec</td>
<td>YES</td>
<td>YES</td>
<td><a href="https://github.com/semantic-conflicts/SemanticConflicts/tree/master/results/fitnesse/4d9ba9d221d879507440feb084fa7521b95111ec/original">Here</a></td>
<td><a href="https://github.com/semantic-conflicts/SemanticConflicts/tree/master/results/fitnesse/4d9ba9d221d879507440feb084fa7521b95111ec/transformed">Here</a></td>
</tr>
<tr>
<td>square/okhttp</td>
<td>35166168529bd27281685e56a0a122eff44460e9</td>
<td>NO</td>
<td>NO</td>
<td><a href="https://github.com/semantic-conflicts/SemanticConflicts/tree/master/results/okhttp/35166168529bd27281685e56a0a122eff44460e9/original">Here</a></td>
<td><a href="https://github.com/semantic-conflicts/SemanticConflicts/tree/master/results/okhttp/35166168529bd27281685e56a0a122eff44460e9/transformed">Here</a></td>
</tr>
<tr>
<td>jOOQ/jOOQ</td>
<td>d96120f327107feb1ebb15e7c090dc38eeff72ca</td>
<td>NO</td>
<td>NO</td>
<td><a href="https://github.com/semantic-conflicts/SemanticConflicts/tree/master/results/jOOQ/d96120f327107feb1ebb15e7c090dc38eeff72ca/original">Here</a></td>
<td><a href="https://github.com/semantic-conflicts/SemanticConflicts/tree/master/results/jOOQ/d96120f327107feb1ebb15e7c090dc38eeff72ca/transformed">Here</a></td>
</tr>
<tr>
<td>kongchen/swagger-maven-plugin</td>
<td>e825a7fdc6ef688f1253b93d2cb236e710acfc56</td>
<td>YES</td>
<td>NO</td>
<td>-</td>
<td>-</td>
</tr>
<tr>
<td>square/retrofit</td>
<td>71f622ce51031b152a0be6ad5facfb27a654bf5a</td>
<td>YES</td>
<td>NO</td>
<td><a href="https://github.com/semantic-conflicts/SemanticConflicts/tree/master/results/retrofit/71f622ce51031b152a0be6ad5facfb27a654bf5a/original">Here</a></td>
<td><a href="https://github.com/semantic-conflicts/SemanticConflicts/tree/master/results/retrofit/71f622ce51031b152a0be6ad5facfb27a654bf5a/transformed">Here</a></td>
</tr>
<tr>
<td>richardwilly98/elasticsearch-river-mongodb</td>
<td>3d4f99516ba3177f7d88a1f600923138a8b77cc8</td>
<td>YES</td>
<td>NO</td>
<td><a href="https://github.com/semantic-conflicts/SemanticConflicts/tree/master/results/elasticsearch-river-mongodb/3d4f99516ba3177f7d88a1f600923138a8b77cc8/original">Here</a></td>
<td><a href="https://github.com/semantic-conflicts/SemanticConflicts/tree/master/results/elasticsearch-river-mongodb/3d4f99516ba3177f7d88a1f600923138a8b77cc8/transformed">Here</a></td>
</tr>
<tr>
<td>jhy/jsoup</td>
<td>a8b6982de98ff76ef254031d7152fff57f6bf941</td>
<td>YES</td>
<td>NO</td>
<td><a href="https://github.com/semantic-conflicts/SemanticConflicts/tree/master/results/jsoup/a8b6982de98ff76ef254031d7152fff57f6bf941/original">Here</a></td>
<td><a href="https://github.com/semantic-conflicts/SemanticConflicts/tree/master/results/jsoup/a8b6982de98ff76ef254031d7152fff57f6bf941/transformed">Here</a></td>
</tr>
<tr>
<td>jhy/jsoup</td>
<td>3f7d2c71dbbbb289c684f339874eed8ac2747fa0</td>
<td>YES</td>
<td>NO</td>
<td><a href="https://github.com/semantic-conflicts/SemanticConflicts/tree/master/results/jsoup/3f7d2c71dbbbb289c684f339874eed8ac2747fa0/original">Here</a></td>
<td><a href="https://github.com/semantic-conflicts/SemanticConflicts/tree/master/results/jsoup/3f7d2c71dbbbb289c684f339874eed8ac2747fa0/transformed">Here</a></td>
</tr>
<tr>
<td>jhy/jsoup</td>
<td>a44e18aa3c1fcd25a68a5965f9490d8f7d026509</td>
<td>YES</td>
<td>NO</td>
<td><a href="https://github.com/semantic-conflicts/SemanticConflicts/tree/master/results/jsoup/a44e18aa3c1fcd25a68a5965f9490d8f7d026509/original">Here</a></td>
<td><a href="https://github.com/semantic-conflicts/SemanticConflicts/tree/master/results/jsoup/a44e18aa3c1fcd25a68a5965f9490d8f7d026509/transformed">Here</a></td>
</tr>
<tr>
<td>Netflix/SymianArmy</td>
<td>345ad9513aafff397050d613fa87ad06ddffe99d</td>
<td>NO</td>
<td>NO</td>
<td><a href="https://github.com/semantic-conflicts/SemanticConflicts/tree/master/results/SymianArmy/345ad9513aafff397050d613fa87ad06ddffe99d/original">Here</a></td>
<td><a href="https://github.com/semantic-conflicts/SemanticConflicts/tree/master/results/SymianArmy/345ad9513aafff397050d613fa87ad06ddffe99d/transformed">Here</a></td>
</tr>
<tr>
<td>thinkaurelius/titan</td>
<td>387c16ea05ef9fa312f37139228d2bbf61455ff4</td>
<td>NO</td>
<td>NO</td>
<td><a href="https://github.com/semantic-conflicts/SemanticConflicts/tree/master/results/titan/387c16ea05ef9fa312f37139228d2bbf61455ff4/original">Here</a></td>
<td><a href="https://github.com/semantic-conflicts/SemanticConflicts/tree/master/results/titan/387c16ea05ef9fa312f37139228d2bbf61455ff4/transformed">Here</a></td>
</tr>
<tr>
<td>elastic/elasticsearch</td>
<td>59cb67c7bd0ab6311115b20954e013412b676b29</td>
<td>NO</td>
<td>NO</td>
<td><a href="https://github.com/semantic-conflicts/SemanticConflicts/tree/master/results/elastic-search/59cb67c7bd0ab6311115b20954e013412b676b29/original">Here</a></td>
<td><a href="https://github.com/semantic-conflicts/SemanticConflicts/tree/master/results/elastic-search/59cb67c7bd0ab6311115b20954e013412b676b29/transformed">Here</a></td>
</tr>
<tr>
<td>Activiti/Activiti</td>
<td>50d8e43eb5917c63abfbcdec1e68e510943f325a</td>
<td>YES</td>
<td>NO</td>
<td><a href="https://github.com/semantic-conflicts/SemanticConflicts/tree/master/results/Activiti/50d8e43eb5917c63abfbcdec1e68e510943f325a/original">Here</a></td>
<td><a href="https://github.com/semantic-conflicts/SemanticConflicts/tree/master/results/Activiti/50d8e43eb5917c63abfbcdec1e68e510943f325a/transformed">Here</a></td>
</tr>
<tr>
<td>druid/druid</td>
<td>05168808c278c080c59c19e858d9471b316cd1f5</td>
<td>NO</td>
<td>NO</td>
<td><a href="https://github.com/semantic-conflicts/SemanticConflicts/tree/master/results/druid/05168808c278c080c59c19e858d9471b316cd1f5/original">Here</a></td>
<td><a href="https://github.com/semantic-conflicts/SemanticConflicts/tree/master/results/druid/05168808c278c080c59c19e858d9471b316cd1f5/transformed">Here</a></td>
</tr>
<tr>
<td>netty/netty</td>
<td>193acdb36cd3da9bfc62dd69c4208dff3f0a2b1b</td>
<td>YES</td>
<td>NO</td>
<td><a href="https://github.com/semantic-conflicts/SemanticConflicts/tree/master/results/netty/193acdb36cd3da9bfc62dd69c4208dff3f0a2b1b/original">Here</a></td>
<td><a href="https://github.com/semantic-conflicts/SemanticConflicts/tree/master/results/netty/193acdb36cd3da9bfc62dd69c4208dff3f0a2b1b/transformed">Here</a></td>
</tr>
<tr>
<td>opentripplanner/OpenTripPlanner</td>
<td>4c506dce43775704919d084f0acfba86d251bf4a</td>
<td>NO</td>
<td>NO</td>
<td><a href="https://github.com/semantic-conflicts/SemanticConflicts/tree/master/results/OpenTripPlanner/4c506dce43775704919d084f0acfba86d251bf4a/original">Here</a></td>
<td><a href="https://github.com/semantic-conflicts/SemanticConflicts/tree/master/results/OpenTripPlaner/4c506dce43775704919d084f0acfba86d251bf4a/transformed">Here</a></td>
</tr>
<tr>
<td>webbit/webbit</td>
<td>74d2d2b87704d003acacb34e4ca8fb5f897b938f</td>
<td>NO</td>
<td>NO</td>
<td><a href="https://github.com/semantic-conflicts/SemanticConflicts/tree/master/results/webbit/74d2d2b87704d003acacb34e4ca8fb5f897b938f/original">Here</a></td>
<td><a href="https://github.com/semantic-conflicts/SemanticConflicts/tree/master/results/webbit/74d2d2b87704d003acacb34e4ca8fb5f897b938f/transformed">Here</a></td>
</tr>
<tr>
<td>spring-projects/spring-boot</td>
<td>ea8107b6a53fa60b5f23b33e1b6d2e88bb60133c</td>
<td>NO</td>
<td>NO</td>
<td><a href="https://github.com/semantic-conflicts/SemanticConflicts/tree/master/results/spring-boot/ea8107b6a53fa60b5f23b33e1b6d2e88bb60133c/original">Here</a></td>
<td><a href="https://github.com/semantic-conflicts/SemanticConflicts/tree/master/results/spring-boot/ea8107b6a53fa60b5f23b33e1b6d2e88bb60133c/transformed">Here</a></td>
</tr>
<tr>
<td>spring-projects/spring-boot</td>
<td>af20dc6cc45c032573413c401f9f73aa75371744</td>
<td>NO</td>
<td>NO</td>
<td><a href="https://github.com/semantic-conflicts/SemanticConflicts/tree/master/results/spring-boot/af20dc6cc45c032573413c401f9f73aa75371744/original">Here</a></td>
<td><a href="https://github.com/semantic-conflicts/SemanticConflicts/tree/master/results/spring-boot/af20dc6cc45c032573413c401f9f73aa75371744/transformed">Here</a></td>
</tr>
<tr>
<td>Netflix/eureka</td>
<td>6tb09030e95e118a784ca7ec616398a4f0e384bcd</td>
<td>NO</td>
<td>NO</td>
<td><a href="https://github.com/semantic-conflicts/SemanticConflicts/tree/master/results/eureka/6tb09030e95e118a784ca7ec616398a4f0e384bcd/original">Here</a></td>
<td><a href="https://github.com/semantic-conflicts/SemanticConflicts/tree/master/results/eureka/6tb09030e95e118a784ca7ec616398a4f0e384bcd/transformed">Here</a></td>
</tr>
<tr>
<td>atmosphere/atmosphere</td>
<td>ffc0c6e274094c6423e29d1c45bab1593b8fac7d</td>
<td>NO</td>
<td>NO</td>
<td><a href="https://github.com/semantic-conflicts/SemanticConflicts/tree/master/results/atmosphere/ffc0c6e274094c6423e29d1c45bab1593b8fac7d/original">Here</a></td>
<td><a href="https://github.com/semantic-conflicts/SemanticConflicts/tree/master/results/atmosphere/ffc0c6e274094c6423e29d1c45bab1593b8fac7d/transformed">Here</a></td>
</tr>
<tr>
<td>elastic/elasticsearch</td>
<td>f3d63095dbcc985e24162fbac4ee0d6914dc757d</td>
<td>NO</td>
<td>NO</td>
<td><a href="https://github.com/semantic-conflicts/SemanticConflicts/tree/master/results/elastic-search/f3d63095dbcc985e24162fbac4ee0d6914dc757d/original">Here</a></td>
<td><a href="https://github.com/semantic-conflicts/SemanticConflicts/tree/master/results/elastic-search/f3d63095dbcc985e24162fbac4ee0d6914dc757d/transformed">Here</a></td>
</tr>
<tr>
<td>elastic/elasticsearch</td>
<td>36884807b3cc9d660db4da062275c7fdbec8ba67</td>
<td>NO</td>
<td>NO</td>
<td><a href="https://github.com/semantic-conflicts/SemanticConflicts/tree/master/results/elastic-search/36884807b3cc9d660db4da062275c7fdbec8ba67/original">Here</a></td>
<td><a href="https://github.com/semantic-conflicts/SemanticConflicts/tree/master/results/elastic-search/36884807b3cc9d660db4da062275c7fdbec8ba67/transformed">Here</a></td>
</tr>
<tr>
<td>resty-gwt/resty-gwt</td>
<td>867b917c43c32acbdcac55767e7f04334006c866</td>
<td>YES</td>
<td>NO</td>
<td>-</td>
<td>-</td>
</tr>
<tr>
<td>jhy/jsoup</td>
<td>fee4762322f85a1109edd75ccb67f38cf5008c80</td>
<td>NO</td>
<td>NO</td>
<td><a href="https://github.com/semantic-conflicts/SemanticConflicts/tree/master/results/jsoup/fee4762322f85a1109edd75ccb67f38cf5008c80/original">Here</a></td>
<td><a href="https://github.com/semantic-conflicts/SemanticConflicts/tree/master/results/jsoup/fee4762322f85a1109edd75ccb67f38cf5008c80/transformed">Here</a></td>
</tr>
<tr>
<td>square/retrofit</td>
<td>2b6c719c6645f8e48dca6d0047c752069d321bc4</td>
<td>NO</td>
<td>NO</td>
<td><a href="https://github.com/semantic-conflicts/SemanticConflicts/tree/master/results/retrofit/2b6c719c6645f8e48dca6d0047c752069d321bc4/logAndReplaceRequest/original">Here</a></td>
<td><a href="https://github.com/semantic-conflicts/SemanticConflicts/tree/master/results/retrofit/2b6c719c6645f8e48dca6d0047c752069d321bc4/logAndReplaceRequest/transformed">Here</a></td>
</tr>
<tr>
<td>square/retrofit</td>
<td>2b6c719c6645f8e48dca6d0047c752069d321bc4</td>
<td>NO</td>
<td>NO</td>
<td><a href="https://github.com/semantic-conflicts/SemanticConflicts/tree/master/results/retrofit/2b6c719c6645f8e48dca6d0047c752069d321bc4/logAndReplaceResponse/original">Here</a></td>
<td><a href="https://github.com/semantic-conflicts/SemanticConflicts/tree/master/results/retrofit/2b6c719c6645f8e48dca6d0047c752069d321bc4/logAndReplaceResponse/transformed">Here</a></td>
</tr>
<tr>
<td>Activiti/Activiti</td>
<td>bf46684ba62f5883673ea8fb0a14aecfe0aedea2</td>
<td>NO</td>
<td>NO</td>
<td><a href="https://github.com/semantic-conflicts/SemanticConflicts/tree/master/results/Activiti/bf46684ba62f5883673ea8fb0a14aecfe0aedea2/original">Here</a></td>
<td><a href="https://github.com/semantic-conflicts/SemanticConflicts/tree/master/results/Activiti/bf46684ba62f5883673ea8fb0a14aecfe0aedea2/transformed">Here</a></td>
</tr>
<tr>
<td>square/okhttp</td>
<td>1151c9853ccc3c9c3211c613b9b845b925f8c6a6</td>
<td>NO</td>
<td>NO</td>
<td><a href="https://github.com/semantic-conflicts/SemanticConflicts/tree/master/results/okhttp/1151c9853ccc3c9c3211c613b9b845b925f8c6a6/original">Here</a></td>
<td><a href="https://github.com/semantic-conflicts/SemanticConflicts/tree/master/results/okhttp/1151c9853ccc3c9c3211c613b9b845b925f8c6a6/transformed">Here</a></td>
</tr>
<tr>
<td>brettwooldridge/HikariCP</td>
<td>1bca94af9ec625f21d1b58ff10efb5be71ab87a6</td>
<td>NO</td>
<td>NO</td>
<td><a href="https://github.com/semantic-conflicts/SemanticConflicts/tree/master/results/HikariCP/1bca94af9ec625f21d1b58ff10efb5be71ab87a6/original">Here</a></td>
<td><a href="https://github.com/semantic-conflicts/SemanticConflicts/tree/master/results/HikariCP/1bca94af9ec625f21d1b58ff10efb5be71ab87a6/transformed">Here</a></td>
</tr>
<tr>
<td>sanity/quickml</td>
<td>bae968d9a85c0501ba8842a6f88e7fc2c6b78693</td>
<td>NO</td>
<td>NO</td>
<td><a href="https://github.com/semantic-conflicts/SemanticConflicts/tree/master/results/quickml/bae968d9a85c0501ba8842a6f88e7fc2c6b78693/original">Here</a></td>
<td><a href="https://github.com/semantic-conflicts/SemanticConflicts/tree/master/results/quickml/bae968d9a85c0501ba8842a6f88e7fc2c6b78693/transformed">Here</a></td>
</tr>
<tr>
<td>relayrides/pushy</td>
<td>58901c846e4f0874977c5aabbc34bcb4de3670e0</td>
<td>NO</td>
<td>NO</td>
<td><a href="https://github.com/semantic-conflicts/SemanticConflicts/tree/master/results/pushy/58901c846e4f0874977c5aabbc34bcb4de3670e0/original">Here</a></td>
<td><a href="https://github.com/semantic-conflicts/SemanticConflicts/tree/master/results/pushy/58901c846e4f0874977c5aabbc34bcb4de3670e0/transformed">Here</a></td>
</tr>
<tr>
<td>DiUS/java-faker</td>
<td>ca42fcfaf45cae1754c58e02e1d5d2a58ec03561</td>
<td>NO</td>
<td>NO</td>
<td><a href="https://github.com/semantic-conflicts/SemanticConflicts/tree/master/results/java-faker/ca42fcfaf45cae1754c58e02e1d5d2a58ec03561/original">Here</a></td>
<td><a href="https://github.com/semantic-conflicts/SemanticConflicts/tree/master/results/java-faker/ca42fcfaf45cae1754c58e02e1d5d2a58ec03561/transformed">Here</a></td>
</tr>
<tr>
<td>swagger-api/swagger-core</td>
<td>e7fea7c4889dbdd6a4e0b2d059c8aa0f126ab1c2</td>
<td>NO</td>
<td>NO</td>
<td><a href="https://github.com/semantic-conflicts/SemanticConflicts/tree/master/results/swagger-core/e7fea7c4889dbdd6a4e0b2d059c8aa0f126ab1c2/original">Here</a></td>
<td><a href="https://github.com/semantic-conflicts/SemanticConflicts/tree/master/results/swagger-core/e7fea7c4889dbdd6a4e0b2d059c8aa0f126ab1c2/transformed">Here</a></td>
</tr>
<tr>
<td>cucumber/cucumber-jvm</td>
<td>4505c156b6267c1b760deec570ddbfe047b42aa9</td>
<td>NO</td>
<td>NO</td>
<td><a href="https://github.com/semantic-conflicts/SemanticConflicts/tree/master/results/cucumber-jvm/4505c156b6267c1b760deec570ddbfe047b42aa9/original">Here</a></td>
<td><a href="https://github.com/semantic-conflicts/SemanticConflicts/tree/master/results/cucumber-jvm/4505c156b6267c1b760deec570ddbfe047b42aa9/transformed">Here</a></td>
</tr>
</tbody></table>

