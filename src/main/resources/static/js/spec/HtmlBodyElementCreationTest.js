describe("A collection of functions that", function() {
	describe("create HTML elements", function() {
		describe("when passed div", function() {
			it("creates a div element", function() {
				const underTest = createHtmlElement;
				
				const testDiv = underTest('div');

				expect(testDiv.tagName).toBe('div');
			});
		});
    //expect(true).toBe(true);
  });
});