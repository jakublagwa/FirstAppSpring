package controller;

//TODO:first of all implementing all controllers and items connected with it

@Api
@RestController
public class ProjectApiController {

	@Autowired
	private ProjectService project service;
	
	
	//TODO: add my apiexception class
	@ApiOperation(value="adds a project")
	@RequestMapping(path="/api/project", method=RequestMethod.POST)
	public void add(@RequestBody ProjectForm projectForm) throws Exception{
		
	}
	
	@ApiOperation(value="deletes a project")
	@RequestMapping(path="/api/project/{id}", method.RequestMethod.DELETE)
	public void delete(@PathVariable int id){
		
	}
	
	@ApiOperation(value="gets a project by an id")
	@RequestMapping(path="/api/project/{id}", method=RequestMethod.GET)
	
	@ApiOperation(value="returns list of projects with their id")
	@RequestMapping
	
}
