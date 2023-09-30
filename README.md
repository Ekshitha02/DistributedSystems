README.md: A detailed manual describing the structure of your files and directory organization. The manual should contain a description of how to build the program and how to run the program.

For Part-2 :
The files and directories of the program are organised as follows:
dataset-generator/
       src/
      └─  DatasetGenerator.java
        README.md
•	dataset-generator/ : main project directory
•	src/ : directory contains the source code file DatasetGenerator.java
•	README.md : Documentation file containing project details.
How to build the program and how to run the program?
Building the program : 
Open the cmd or terminal and navigate to dataset-generator/src/ directory.
I have used the following command to compile the program in the command prompt:
javac DatasetGenerator.java
This command will create a bytecode file called DatasetGenerator.class in 
Running the program :
To run the program, I have used the following command:
java DatasetGenerator.java
The following command-line parameters are accepted by the java program:
<num_entries> : The number of entries to create.
<output_file>: The location to the output file where the created entries will be kept.
Java DataGeneratorset <num_entries> <output_file>
While running the code replace num_entries with an integer specifying entries number and output_file with the desired output file.
Generating Datasets :
Run the following command to produce a dataset with 65536 entries and save it to a file called output.txt:
Java DatasetGenerator 65536 output.txt.    (repeat the process)


For Part-3 :
sort-data/
      SortData.java
     README.md
•	sort-data/ : main project directory.
•	SortData.java : The primary program file that handles data sorting.
•	README.md : Documentation file containing project details.
How to build the program and how to run the program?
Building the program : 
Open the cmd or terminal and navigate to sort-data/ directory.
I have used the following command to compile the program in the command prompt:
javac SortData.java
This command will create a bytecode file called DatasetGenerator.class in 
Running the program :
To run the program, I have used the following command:
java SortData.java
The following command-line parameters are accepted by the java program:
<input_file > : The location of the unsorted data input file.
<temp_directory> :  The path to the temporary directory containing intermediate files.
<output_file>: The location to the output file where the created entries will be kept.
java SortData <input_file> <temp_directory> <output_file>
While running the code replace input_file with output.txt as the data was stored in the output.txt in the previous program and temp_directory with temp and output_file with input.txt so that the sorted data will be stored in input.txt.


