package id.bts.pattern19to31.bootstrap;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import id.bts.pattern19to31.services.Pattern19Generator;
import id.bts.pattern19to31.services.Pattern20Generator;
import id.bts.pattern19to31.services.Pattern21Generator;
import id.bts.pattern19to31.services.Pattern22Generator;
import id.bts.pattern19to31.services.Pattern23Generator;
import id.bts.pattern19to31.services.Pattern24Generator;
import id.bts.pattern19to31.services.Pattern25Generator;
import id.bts.pattern19to31.services.Pattern26Generator;
import id.bts.pattern19to31.services.Pattern27Generator;
import id.bts.pattern19to31.services.Pattern29Generator;
import id.bts.pattern19to31.services.Pattern30Generator;
import id.bts.pattern19to31.services.Pattern31Generator;

@Component
public class Bootstrap implements CommandLineRunner{

	@Autowired
	private Pattern19Generator pattern19Generator;
	
	@Autowired
	private Pattern20Generator pattern20Generator;
	
	@Autowired
	private Pattern21Generator pattern21Generator;
	
	@Autowired
	private Pattern22Generator pattern22Generator;
	
	@Autowired
	private Pattern23Generator pattern23Generator;
	
	@Autowired
	private Pattern24Generator pattern24Generator;
	
	@Autowired
	private Pattern25Generator pattern25Generator;
	
	@Autowired
	private Pattern26Generator pattern26Generator;
	
	@Autowired
	private Pattern27Generator pattern27Generator;
	
	@Autowired
	private Pattern29Generator pattern29Generator;
	
	@Autowired
	private Pattern30Generator pattern30Generator;
	
	@Autowired
	private Pattern31Generator pattern31Generator;
	
	@Override
	public void run(String... args) throws Exception {
		
		Scanner scanner = new Scanner(System.in);
		int size;
		
		System.out.println("Masukan size pattern: ");
		size = scanner.nextInt();
		
		System.out.println("Pattern 19");
		pattern19Generator.generatePattern19(size);
		
		System.out.println("Pattern 20");
		pattern20Generator.generatePattern20(size);
		
		System.out.println("Pattern 21");
		pattern21Generator.generatePattern21(size);
		
		System.out.println("pattern 22");
		pattern22Generator.generatePattern22(size);
		
		System.out.println("pattern 23");
		pattern23Generator.generatePattern23(size);
		
		System.out.println("pattern 24");
		pattern24Generator.generatePattern24(size);
		
		System.out.println("pattern 25");
		pattern25Generator.generatePattern25(size);
		
		System.out.println("pattern 26");
		pattern26Generator.generatePattern26(size);
		
		System.out.println("pattern 27");
		pattern27Generator.generatePattern27(size);
		
		System.out.println("pattern 29");
		pattern29Generator.generatePattern29(size);
		
		System.out.println("pattern 30");
		pattern30Generator.generatePattern30(size);
		
		System.out.println("pattern 31");
		pattern31Generator.generatePattern31(size);
		
		scanner.close();
	}

}
