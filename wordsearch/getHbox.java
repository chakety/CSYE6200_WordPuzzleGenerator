public HBox getHbox() {
		HBox hbox = new HBox(2);
		hbox.setPadding(new Insets(5,10,5,10));
		hbox.setSpacing(5);
		Button btn = new Button("Search");
		TextField txt = new TextField("Initial text");
		
		Label l1 = new Label();
		l1.setWrapText(true);
		
		
		EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub

				try {
					wordsearch(txt.getText());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try(BufferedReader fin = new BufferedReader(new FileReader("rst.txt"))){
					String rst = "";
					int i = 0;
					StringBuilder str = new StringBuilder();
					while((rst = fin.readLine()) != null && i <10) {
						str.append(rst);
						str.append("\n");
						i++;
						}
					l1.setText(str.toString());
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
		};
		
		
		btn.setOnAction(event);
		txt.setOnAction(event);
		hbox.setAlignment(Pos.TOP_LEFT);
		hbox.getChildren().addAll(getVbox(txt, l1),btn);
		
		return hbox;
		
		
	}
