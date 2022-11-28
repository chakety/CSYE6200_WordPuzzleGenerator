public static void wordsearch(String args) throws IOException {
		String s1 = args.replaceAll(" ", "[A-Z]");
		System.out.println(s1);
		FileWriter fout = new FileWriter("rst.txt");
		try(BufferedReader fin = new BufferedReader(new FileReader("dict.txt"))){
			Pattern pattern = Pattern.compile(s1);
			String rst = "";
			while((rst = fin.readLine()) != null) {
				Matcher match = pattern.matcher(rst);
				while(match.find() && rst.length() == args.length()) {
					int start = match.start(0);
					int end = match.end(0);
					fout.write((String) rst.substring(start, end) + "\n");
				}
			}
			fin.close();
			fout.close();
		}
		catch(FileNotFoundException ex) {
			System.out.println("File not found.");
			System.exit(0);
		}
	}
