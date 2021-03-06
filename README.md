# Abstract

Branching and merging are common practices in collaborative software development. They increase developer productivity by fostering teamwork, allowing developers to independently contribute to a software project. Despite such benefits, branching and merging comes at a cost—the need to merge software and to resolve merge conflicts, which often occur in practice. While modern merge techniques, such as 3-way or structured merge, can resolve many such conflicts automatically, they fail when the conflict arises not at the syntactic, but the semantic level. Detecting such conflicts requires understanding the behavior of the software, which is beyond the capabilities of most existing merge tools. As such, semantic conflicts can only be identified and fixed with significant effort and knowledge of the changes to be merged. While semantic merge tools have been proposed, they are usually heavyweight, based on static analysis, and need explicit specifications of program behavior. In this work, we take a different route and explore the automated creation of unit tests of partial specifications to detect unwanted behavior changes (conflicts) when merging software. We systematically explore the detection of semantic conflicts through unit-test generation. Relying on a ground-truth dataset of software merge scenarios, which we extracted from GitHub and manually investigated whether semantic conflicts exist, we apply test-generation tools to study their detection rates. We propose improvements (code transformations) and study their effectiveness, as well as we qualitatively analyze the detection results and propose future improvements For example, we analyze the generated test suites for false-negative cases to understand the reasons behind the no detection. Our results evidence the feasibility of using test-case generation to detect semantic conflicts as a method that is versatile and requires only limited deployment effort in practice as well as it does not require explicit behavior specifications.

## Results
<a href="https://semantic-conflicts.github.io/SemanticConflicts/results/results">Here</a> you can find our results and the test suites we generated during our study execution.

## Scripts
<a href="https://semantic-conflicts.github.io/SemanticConflicts/study/scripts">Here</a> you can find the scripts we used to run our study.



