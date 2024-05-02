package webapitest.steps;

import webapitest.methods.CommonMethods;
import webapitest.methods.CommunityApiMethods;

public class CommunityApiSteps {
	CommunityApiMethods communityApiMethods = new CommunityApiMethods();

		boolean stepPass = true;
		
		public void getConsultants() throws Exception {
			String step = "When I run Get Consultants api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.getConsultants()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}
	

		public void verifyGetConsultants() throws Exception {
			String step = "Then I should verify sucessful Get Consultants api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verifyGetConsultants()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}
		
		
		public void getConsultant() throws Exception {
			String step = "When I run Get Consultant api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.getConsultant()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		
		public void verifyGetConsultant() throws Exception {
			String step = "Then I should verify sucessful Get Consultant api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verifyGetConsultant()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}

		
		public void getEntities() throws Exception {
			String step = "When I run 'Get Entities' api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.getEntities()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		public void verifyGetEntities() throws Exception {
			String step = "Then I should verify sucessful 'Get Entities' api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verifyGetEntities()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}
		
		public void getEntityById() throws Exception {
			String step = "When I run 'Get Entity by Id' api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.getEntityById()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		public void verifyGetEntityById() throws Exception {
			String step = "Then I should verify sucessful 'Get Entity by Id' api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verifyGetEntityById()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}
		
		
		public void getEntities_InvalidToken() throws Exception {
			String step = "When I run Get Entities Invalid Token api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.getEntities_InvalidToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}		
			
		
		public void verifyGetEntities_InvalidToken() throws Exception {
			String step = "Then I should verify sucessful Get Entities Invalid Token api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verifyGetEntities_InvalidToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		public void getEntities_NoToken() throws Exception {
			String step = "When I run Get Entities No Token api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.getEntities_NoToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		public void verifyGetEntities_NoToken() throws Exception {
			String step = "Then I should verify sucessful Get Entities No Token api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verifyGetEntities_NoToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		public void getEntityById_InavlidToken() throws Exception {
			String step = "When I run Get Entity by Id Invalid Token api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.getEntityById_InavlidToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		
		public void verifyGetEntityById_InavlidToken() throws Exception {
			String step = "Then I should verify sucessful Get Entity by Id Invalid Token api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verifyGetEntityById_InavlidToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		public void getEntityById_NoToken() throws Exception {
			String step = "When I run Get Entity by Id No Token api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.getEntityById_NoToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
			
		public void verifyGetEntityById_NoToken() throws Exception {
			String step = "Then I should verify sucessful Get Entity by Id No Token api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verify_Invalid_or_NoToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		
		public void postRequestDirectDebit() throws Exception {
			String step = "When I run Post Request Direct Debit api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.postRequestDirectDebit()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		
		public void verify_PostRequestDirectDebit() throws Exception {
			String step = "Then I should verify sucessful Post Request Direct Debit api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verify_PostRequestDirectDebit()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		
		public void postRequestDirectDebit_InvalidToken() throws Exception {
			String step = "When I run Post Request Direct Debit Invalid Token api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.postRequestDirectDebit_InvalidToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}		
		
		public void verify_PostRequestDirectDebit_InvalidToken() throws Exception {
			String step = "Then I should verify sucessful Post Request Direct Debit Invalid Token api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verify_PostRequestDirectDebit_InvalidToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}		
		
		
		
		public void postRequestDirectDebit_NoToken() throws Exception {
			String step = "When I run Post Request Direct Debit No Token api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.postRequestDirectDebit_NoToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}			
		
		public void verify_PostRequestDirectDebit_NoToken() throws Exception {
			String step = "Then I should verify sucessful Post Request Direct Debit No Token api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verify_PostRequestDirectDebit_NoToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		
		public void getRequestDirectDebit() throws Exception {
			String step = "When I run Get Request Direct Debit api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.getRequestDirectDebit()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		
		public void verify_getRequestDirectDebit() throws Exception {
			String step = "Then I should verify sucessful Get Request Direct Debit api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verify_getRequestDirectDebit()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}		
		
		public void getRequestDirectDebit_InvalidToken() throws Exception {
			String step = "When I run Get Request Direct Debit Invalid Token api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.getRequestDirectDebit_InvalidToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}		
		
		
		public void verify_getRequestDirectDebit_InvalidToken() throws Exception {
			String step = "Then I should verify sucessful Get Request Direct Debit Invalid Token api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verify_getRequestDirectDebit_InvalidToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}			
		
		
		public void getRequestDirectDebit_NoToken() throws Exception {
			String step = "When I run Get Request Direct Debit No Token api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.getRequestDirectDebit_NoToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}			
		
	
		public void verify_getRequestDirectDebit_NoToken() throws Exception {
			String step = "Then I should verify sucessful Get Request Direct Debit No Token api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verify_getRequestDirectDebit_NoToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}			
		
	
		public void patchRequestDirectDebit() throws Exception {
			String step = "When I run Patch Request Direct Debit api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.patchRequestDirectDebit()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}				
		
		public void verify_patchRequestDirectDebit() throws Exception {
			String step = "Then I should verify sucessful Patch Request Direct Debit api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verify_patchRequestDirectDebit()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}		
		
		
		public void patchRequestDirectDebit_InvalidToken() throws Exception {
			String step = "When I run Patch Request Direct Debit Invalid Token api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.patchRequestDirectDebit_InvalidToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}					
		
		public void verify_patchRequestDirectDebit_InvalidToken() throws Exception {
			String step = "Then I should verify sucessful Patch Request Direct Debit Invalid Token api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verify_patchRequestDirectDebit_InvalidToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}		
		
		public void patchRequestDirectDebit_NoToken() throws Exception {
			String step = "When I run Patch Request Direct Debit No Token api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.patchRequestDirectDebit_NoToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}			
		
		
		public void verify_patchRequestDirectDebit_NoToken() throws Exception {
			String step = "Then I should verify sucessful Patch Request Direct Debit No Token api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verify_patchRequestDirectDebit_NoToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}		
		
		
		public void getUserSetting() throws Exception {
			String step = "When I run Get User Setting api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.getUserSetting()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		public void verify_GetUserSetting() throws Exception {
			String step = "Then I should verify sucessful Get User Setting api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verify_GetUserSetting()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		public void getUserSetting_InvalidToken() throws Exception {
			String step = "When I run Get User Setting Invalid Token api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.getUserSetting_InvalidToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		public void verify_getUserSetting_InvalidToken() throws Exception {
			String step = "Then I should verify sucessful Get User Setting Invalid Token api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verify_getUserSetting_InvalidToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		
		public void getUserSetting_NoToken() throws Exception {
			String step = "When I run Get User Setting No Token api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.getUserSetting_NoToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}		
		
		public void verify_getUserSetting_NoToken() throws Exception {
			String step = "Then I should verify sucessful Get User Setting No Token api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verify_getUserSetting_NoToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
	
		
		public void postAddUserSetting() throws Exception {
			String step = "When I run Post Add User Setting api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.postAddUserSetting()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}		
		
		
		public void verify_postAddUserSetting() throws Exception {
			String step = "Then I should verify sucessful Post Add User Setting api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verify_postAddUserSetting()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
	
		public void postAddUserSetting_InvalidToken() throws Exception {
			String step = "When I run Post Add User Setting Invalid Token api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.postAddUserSetting_InvalidToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}		
			
		
		public void verify_postAddUserSetting_InvalidToken() throws Exception {
			String step = "Then I should verify sucessful Post Add User Setting Invalid Token api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verify_postAddUserSetting_InvalidToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}		
		
		public void postAddUserSetting_NoToken() throws Exception {
			String step = "When I run Post Add User Setting No Token api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.postAddUserSetting_NoToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}		
		
		public void verify_postAddUserSetting_NoToken() throws Exception {
			String step = "Then I should verify sucessful Post Add User Setting No Token api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verify_postAddUserSetting_NoToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		public void postAddUserSettingProductName() throws Exception {
			String step = "When I run Post Add User Setting Product Name api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.postAddUserSettingProductName()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}		
		
		public void verify_postAddUserSettingProductName() throws Exception {
			String step = "Then I should verify sucessful Post Add User Setting Product Name api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verify_postAddUserSettingProductName()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		
		public void postAddUserSettingProductName_InvalidToken() throws Exception {
			String step = "When I run Post Add User Setting Product Name Invalid Token api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.postAddUserSettingProductName_InvalidToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		public void verify_postAddUserSettingProductName_InvalidToken() throws Exception {
			String step = "Then I should verify sucessful Post Add User Setting Product Name Invalid Token api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verify_postAddUserSettingProductName_InvalidToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		
		public void postAddUserSettingProductName_NoToken() throws Exception {
			String step = "When I run Post Add User Setting Product Name No Token api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.postAddUserSettingProductName_NoToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}		
		
		
		public void verify_postAddUserSettingProductName_NoToken() throws Exception {
			String step = "Then I should verify sucessful Post Add User Setting Product Name No Token api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verify_postAddUserSettingProductName_NoToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}		
		
		public void postAddUserSettingTermsAndConditions() throws Exception {
			String step = "When I run Post Add User Setting Terms And Conditions api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.postAddUserSettingTermsAndConditions()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}		
		
		
		public void verify_postAddUserSettingTermsAndConditions() throws Exception {
			String step = "Then I should verify sucessful Post Add User Setting Terms And Conditions api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verify_postAddUserSettingTermsAndConditions()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}		
		
		public void postAddUserSettingTermsAndConditions_InvalidToken() throws Exception {
			String step = "When I run Post Add User Setting Terms And Conditions Invalid Token api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.postAddUserSettingTermsAndConditions_InvalidToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}			
		
		
		public void verify_postAddUserSettingTermsAndConditions_InvalidToken() throws Exception {
			String step = "Then I should verify sucessful Post Add User Setting Terms And Conditions Invalid Token api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verify_postAddUserSettingTermsAndConditions_InvalidToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		public void postAddUserSettingTermsAndConditions_NoToken() throws Exception {
			String step = "When I run Post Add User Setting Terms And Conditions No Token api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.postAddUserSettingTermsAndConditions_NoToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		
		public void verify_postAddUserSettingTermsAndConditions_NoToken() throws Exception {
			String step = "Then I should verify sucessful Post Add User Setting Terms And Conditions No Token api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verify_postAddUserSettingTermsAndConditions_NoToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		public void postAddUserSettingWalkthrough() throws Exception {
			String step = "When I run Post Add User Setting Walkthrough api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.postAddUserSettingWalkthrough()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		public void verify_postAddUserSettingWalkthrough() throws Exception {
			String step = "Then I should verify sucessful Post Add User Setting Walkthrough api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verify_postAddUserSettingWalkthrough()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		public void postAddUserSettingWalkthrough_InvalidToken() throws Exception {
			String step = "When I run Post Add User Setting Walkthrough Invalid Token api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.postAddUserSettingWalkthrough_InvalidToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		public void verify_postAddUserSettingWalkthrough_InvalidToken() throws Exception {
			String step = "Then I should verify sucessful Post Add User Setting Walkthrough Invalid Token api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verify_postAddUserSettingWalkthrough_InvalidToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		public void postAddUserSettingWalkthrough_NoToken() throws Exception {
			String step = "When I run Post Add User Setting Walkthrough No Token api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.postAddUserSettingWalkthrough_NoToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		public void verify_postAddUserSettingWalkthrough_NoToken() throws Exception {
			String step = "Then I should verify sucessful Post Add User Setting Walkthrough No Token api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verify_postAddUserSettingWalkthrough_NoToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		public void postAddRequestDrawdown() throws Exception {
			String step = "When I run Post Add Request Drawdown api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.postAddRequestDrawdown()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		
		public void verify_postAddRequestDrawdown() throws Exception {
			String step = "Then I should verify sucessful Post Add Request Drawdown api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verify_postAddRequestDrawdown()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		
		public void postAddRequestDrawdown_InvalidToken() throws Exception {
			String step = "When I run Post Add Request Drawdown Invalid Token api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.postAddRequestDrawdown_InvalidToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		public void verify_postAddRequestDrawdown_InvalidToken() throws Exception {
			String step = "Then I should verify sucessful Post Add Request Drawdown Invalid Token api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verify_postAddRequestDrawdown_InvalidToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		
		public void postAddRequestDrawdown_NoToken() throws Exception {
			String step = "When I run Post Add Request Drawdown No Token api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.postAddRequestDrawdown_NoToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		public void verify_postAddRequestDrawdown_NoToken() throws Exception {
			String step = "Then I should verify sucessful Post Add Request Drawdown No Token api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verify_postAddRequestDrawdown_NoToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		public void getRequestDrawdown() throws Exception {
			String step = "When I run Get Request Drawdown api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.getRequestDrawdown()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		public void verify_getRequestDrawdown() throws Exception {
			String step = "Then I should verify sucessful Get Request Drawdown api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verify_getRequestDrawdown()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		
		public void getRequestDrawdown_InvalidToken() throws Exception {
			String step = "When I run Get Request Drawdown Invalid Token api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.getRequestDrawdown_InvalidToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		public void verify_getRequestDrawdown_InvalidToken() throws Exception {
			String step = "Then I should verify sucessful Get Request Drawdown Invalid Token api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verify_getRequestDrawdown_InvalidToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		
		public void getRequestDrawdown_NoToken() throws Exception {
			String step = "When I run Get Request Drawdown No Token api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.getRequestDrawdown_NoToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		
		public void verify_getRequestDrawdown_NoToken() throws Exception {
			String step = "Then I should verify sucessful Get Request Drawdown No Token api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verify_getRequestDrawdown_NoToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		public void patchRequestDrawdown() throws Exception {
			String step = "When I run Patch Request Drawdown api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.patchRequestDrawdown()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		public void verify_patchRequestDrawdown() throws Exception {
			String step = "Then I should verify sucessful Patch Request Drawdown api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verify_patchRequestDrawdown()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		
		public void patchRequestDrawdown_InvalidToken() throws Exception {
			String step = "When I run Patch Request Drawdown Invalid Token api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.patchRequestDrawdown_InvalidToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		
		public void verify_patchRequestDrawdown_InvalidToken() throws Exception {
			String step = "Then I should verify sucessful Patch Request Drawdown Invalid Token api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verify_patchRequestDrawdown_InvalidToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		public void patchRequestDrawdown_NoToken() throws Exception {
			String step = "When I run Patch Request Drawdown No Token api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.patchRequestDrawdown_NoToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		
		public void verify_getStatements() throws Exception {
			String step = "Then I should verify sucessful Get Statements api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verify_getStatements()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}
		
		
		
		public void getStatements() throws Exception {
			String step = "When I run Get Statements api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.getStatements()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		
		public void verify_patchRequestDrawdown_NoToken() throws Exception {
			String step = "Then I should verify sucessful Patch Request Drawdown No Token api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verify_patchRequestDrawdown_NoToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}
		
		
		public void getStatements_InvalidToken() throws Exception {
			String step = "When I run Get Statements Invalid Token api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.getStatements_InvalidToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}		
		
		public void verify_getStatements_InvalidToken() throws Exception {
			String step = "Then I should verify sucessful Get Statements Invalid Token api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verify_getStatements_InvalidToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		public void getStatements_NoToken() throws Exception {
			String step = "When I run Get Statements No Token api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.getStatements_NoToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		public void verify_getStatements_NoToken() throws Exception {
			String step = "Then I should verify sucessful Get Statements No Token api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verify_getStatements_NoToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		public void getStatementPDF() throws Exception {
			String step = "When I run Get Statement PDF api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.getStatementPDF()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		public void verify_getStatementPDF() throws Exception {
			String step = "Then I should verify sucessful Get Statements PDF api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verify_getStatementPDF()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		public void getStatementPDF_InvalidToken() throws Exception {
			String step = "When I run Get Statement PDF Invalid Token api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.getStatementPDF_InvalidToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		public void verify_getStatementPDF_InvalidToken() throws Exception {
			String step = "Then I should verify sucessful Get Statement PDF Invalid Token api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verify_getStatementPDF_InvalidToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		
		public void getStatementPDF_NoToken() throws Exception {
			String step = "When I run Get Statement PDF No Token api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.getStatementPDF_NoToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		public void verify_getStatementPDF_NoToken() throws Exception {
			String step = "Then I should verify sucessful Get Statement PDF No Token api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verify_getStatementPDF_NoToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}			
		
		public void postStatementEmail() throws Exception {
			String step = "When I run Post Statement Email api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.postStatementEmail()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}			
		
		public void verify_postStatementEmail() throws Exception {
			String step = "Then I should verify sucessful Post Statement Email api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verify_postStatementEmail()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		public void postStatementEmail_InvalidToken() throws Exception {
			String step = "When I run Post Statement Email Invalid Token api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.postStatementEmail_InvalidToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}		
		
		public void verify_postStatementEmail_InvalidToken() throws Exception {
			String step = "Then I should verify sucessful Post Statement Email Invalid Token api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verify_postStatementEmail_InvalidToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}
		
		public void postStatementEmail_NoToken() throws Exception {
			String step = "When I run Post Statement Email No Token api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.postStatementEmail_NoToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		public void verify_postStatementEmail_NoToken() throws Exception {
			String step = "Then I should verify sucessful Post Statement Email No Token api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verify_postStatementEmail_NoToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		public void getUser() throws Exception {
			String step = "When I run Get User api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.getUser()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		public void verify_getUser() throws Exception {
			String step = "Then I should verify sucessful Get User api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verify_getUser()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		public void getUser_InvalidToken() throws Exception {
			String step = "When I run Get User Invalid Token api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.getUser_InvalidToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		public void verify_getUser_InvalidToken() throws Exception {
			String step = "Then I should verify sucessful Get User Invalid Token api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verify_getUser_InvalidToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		public void getUser_NoToken() throws Exception {
			String step = "When I run Get User No Token api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.getUser_NoToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		public void verify_getUser_NoToken() throws Exception {
			String step = "Then I should verify sucessful Get User No Token api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verify_getUser_NoToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		
		public void postSendVerificationCode() throws Exception {
			String step = "When I run Post Send Verification Code api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.postSendVerificationCode()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		public void verify_postSendVerificationCode() throws Exception {
			String step = "Then I should verify sucessful Post Send Verification Code api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verify_postSendVerificationCode()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		public void postSendVerificationCode_InvalidToken() throws Exception {
			String step = "When I run Post Send Verification Code Invalid Token api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.postSendVerificationCode_InvalidToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}
		
		
		public void verify_postSendVerificationCode_InvalidToken() throws Exception {
			String step = "Then I should verify sucessful Post Send Verification Code Invalid Token api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verify_postSendVerificationCode_InvalidToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		public void postSendVerificationCode_NoToken() throws Exception {
			String step = "When I run Post Send Verification Code No Token api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.postSendVerificationCode_NoToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}
		
		public void verify_postSendVerificationCode_NoToken() throws Exception {
			String step = "Then I should verify sucessful Post Send Verification Code No Token api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verify_postSendVerificationCode_NoToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		
		public void postUserMessage() throws Exception {
			String step = "When I run Post User Message api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.postUserMessage()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}
		
		public void verify_postUserMessage() throws Exception {
			String step = "Then I should verify sucessful Post User Message api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verify_postUserMessage()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		public void postUserMessage_InvalidToken() throws Exception {
			String step = "When I run Post User Message Invalid Token api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.postUserMessage_InvalidToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}
		
		public void verify_postUserMessage_InvalidToken() throws Exception {
			String step = "Then I should verify sucessful Post User Message Invalid Token api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verify_postUserMessage_InvalidToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		public void postUserMessage_NoToken() throws Exception {
			String step = "When I run Post User Message No Token api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.postUserMessage_NoToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}
		
		public void verify_postUserMessage_NoToken() throws Exception {
			String step = "Then I should verify sucessful Post User Message No Token api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verify_postUserMessage_NoToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		public void getUserMessage() throws Exception {
			String step = "When I run Get User Messgage api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.getUserMessage()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}
		
		public void verify_getUserMessage() throws Exception {
			String step = "Then I should verify sucessful Get User Message api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verify_getUserMessage()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		
		public void getUserMessage_InvalidToken() throws Exception {
			String step = "When I run Get User Messgage Invalid Token api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.getUserMessage_InvalidToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}
		
		
		
		public void verify_getUserMessage_InvalidToken() throws Exception {
			String step = "Then I should verify sucessful Get User Message Invalid Token api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verify_getUserMessage_InvalidToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		public void getUserMessage_NoToken() throws Exception {
			String step = "When I run Get User Messgage No Token api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.getUserMessage_NoToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}
		
		public void verify_getUserMessage_NoToken() throws Exception {
			String step = "Then I should verify sucessful Get User Message No Token api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verify_getUserMessage_NoToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		public void patchUserMessage() throws Exception {
			String step = "When I run Patch User Messgage api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.patchUserMessage()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}
		
		public void verify_patchUserMessage() throws Exception {
			String step = "Then I should verify sucessful Patch User Message api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verify_patchUserMessage()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		public void patchUserMessage_InvalidToken() throws Exception {
			String step = "When I run Patch User Messgage Invalid Token api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.patchUserMessage_InvalidToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}
		
		
		public void verify_patchUserMessage_InvalidToken() throws Exception {
			String step = "Then I should verify sucessful Patch User Message Invalid Token api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verify_patchUserMessage_InvalidToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		public void patchUserMessage_NoToken() throws Exception {
			String step = "When I run Patch User Messgage No Token api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.patchUserMessage_NoToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}
		
		
		public void verify_patchUserMessage_NoToken() throws Exception {
			String step = "Then I should verify sucessful Patch User Message No Token api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verify_patchUserMessage_NoToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		
		public void getAppSettings() throws Exception {
			String step = "When I run Get App Settings api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.getAppSettings()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}
		
		
		public void verify_getAppSettings() throws Exception {
			String step = "Then I should verify sucessful Get App Settings api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verify_getAppSettings()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		
		public void getAppSettings_InvalidToken() throws Exception {
			String step = "When I run Get App Settings Invalid Token api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.getAppSettings_InvalidToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}
		
		public void verify_getAppSettings_InvalidToken() throws Exception {
			String step = "Then I should verify sucessful Get App Settings Invalid Token api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verify_getAppSettings_InvalidToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		public void getAppSettings_NoToken() throws Exception {
			String step = "When I run Get App Settings No Token api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.getAppSettings_NoToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}
		
		
		public void verify_getAppSettings_NoToken() throws Exception {
			String step = "Then I should verify sucessful Get App Settings No Token api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verify_getAppSettings_NoToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		public void getDesignatedAccounts() throws Exception {
			String step = "When I run Get Designated Accounts api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.getDesignatedAccounts()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}
		
		public void verify_getDesignatedAccounts() throws Exception {
			String step = "Then I should verify sucessful Get Designated Accounts api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verify_getDesignatedAccounts()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}			
		
		public void getDesignatedAccounts_InvalidToken() throws Exception {
			String step = "When I run Get Designated Accounts Invalid Token api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.getDesignatedAccounts_InvalidToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}
		
		public void verify_getDesignatedAccounts_InvalidToken() throws Exception {
			String step = "Then I should verify sucessful Get Designated Accounts Invalid Token api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verify_getDesignatedAccounts_InvalidToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}
		
		public void getDesignatedAccounts_NoToken() throws Exception {
			String step = "When I run Get Designated Accounts No Token api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.getDesignatedAccounts_NoToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}
		
		public void verify_getDesignatedAccounts_NoToken() throws Exception {
			String step = "Then I should verify sucessful Get Designated Accounts No Token api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verify_getDesignatedAccounts_NoToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}
		
		public void getContentName() throws Exception {
			String step = "When I run Get Content Name api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.getContentName()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}
		
		
		public void verify_getContentName() throws Exception {
			String step = "Then I should verify sucessful Get Content Name api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verify_getContentName()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}			
		
		public void getContentName_InvalidToken() throws Exception {
			String step = "When I run Get Content Name Invalid Token api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.getContentName_InvalidToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		public void verify_getContentName_InvalidToken() throws Exception {
			String step = "Then I should verify sucessful Get Content Name Invalid Token api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verify_getContentName_InvalidToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		public void getContentName_NoToken() throws Exception {
			String step = "When I run Get Content Name No Token api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.getContentName_NoToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		public void verify_getContentName_NoToken() throws Exception {
			String step = "Then I should verify sucessful Get Content Name No Token api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verify_getContentName_NoToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		public void getNotifications() throws Exception {
			String step = "When I run Get Notifications api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.getNotifications()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		
		
		public void verify_getNotifications() throws Exception {
			String step = "Then I should verify sucessful Get Notifications api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verify_getNotifications()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}
		
		
		public void getNotifications_InvalidToken() throws Exception {
			String step = "When I run Get Notifications Invalid Token api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.getNotifications_InvalidToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}		
		
		public void verify_getNotifications_InvalidToken() throws Exception {
			String step = "Then I should verify sucessful Get Notifications Invalid Token api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verify_getNotifications_InvalidToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		
		public void getNotifications_NoToken() throws Exception {
			String step = "When I run Get Notifications No Token api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.getNotifications_NoToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}			
		
		public void verify_getNotifications_NoToken() throws Exception {
			String step = "Then I should verify sucessful Get Notifications No Token api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verify_getNotifications_NoToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}			
		
		public void getOccupations() throws Exception {
			String step = "When I run Get Occupations api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.getOccupations()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}		
		
		public void verify_getOccupations() throws Exception {
			String step = "Then I should verify sucessful Get occupations api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verify_getOccupations()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}			
		
		public void postCheckRegisterExistingUser() throws Exception {
			String step = "When I run Post Check Register Existing User api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.postCheckRegisterExistingUser()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		public void verify_postCheckRegisterExistingUser() throws Exception {
			String step = "Then I should verify sucessful Post Check Register  api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verify_postCheckRegisterExistingUser()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}
		
		public void patchRequestDirectDebitIntegration() throws Exception {
			String step = "When I run Patch Request Direct Debit Integration api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.patchRequestDirectDebitIntegration()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		
		public void verify_patchRequestDirectDebitIntegration() throws Exception {
			String step = "Then I should verify sucessful Patch Request Direct Debit Integration api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verify_patchRequestDirectDebitIntegration()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}
		
		public void patchRequestDrawdownIntegration() throws Exception {
			String step = "When I run Patch Request Drawdown Integration api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.patchRequestDrawdownIntegration()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}
		
		public void verify_patchRequestDrawdownIntegration() throws Exception {
			String step = "Then I should verify sucessful Patch Request Drawdown Integration api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verify_patchRequestDrawdownIntegration()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}
		
		public void getTransactions() throws Exception {
			String step = "When I run Get Transactions api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.getTransactions()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}
		
		public void verify_getTransactions() throws Exception {
			String step = "Then I should verify sucessful Get Transactions api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verify_getTransactions()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}
		
		
		public void getTransactions_InvalidToken() throws Exception {
			String step = "When I run Get Transactions Invalid Token api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.getTransactions_InvalidToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}
		
		
		public void verify_getTransactions_InvalidToken() throws Exception {
			String step = "Then I should verify sucessful Get Transactions Invalid Token api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verify_getTransactions_InvalidToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}
		
		
		public void getTransactions_NoToken() throws Exception {
			String step = "When I run Get Transactions No Token api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.getTransactions_NoToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}
	
		
		public void verify_getTransactions_NoToken() throws Exception {
			String step = "Then I should verify sucessful Get Transactions No Token api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verify_getTransactions_NoToken()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		public void patchUserMessageIntegration() throws Exception {
			String step = "When I run Patch User Message Integration api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.patchUserMessageIntegration()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		
		public void verify_patchUserMessageIntegration() throws Exception {
			String step = "Then I should verify sucessful Patch User Message Integration api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verify_patchUserMessageIntegration()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		
		public void getValues() throws Exception {
			String step = "When I run Get Values api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.getValues()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}		
		
		
		public void verify_getValues() throws Exception {
			String step = "Then I should verify sucessful Get Values api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verify_getValues()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}			
		
		public void findPetById() throws Exception {
			String step = "When I run Find pet by Id api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.findPetById()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}			
		
		public void verifyPetById() throws Exception {
			String step = "Then I should verify sucessful Find pet by Id api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verifyPetById()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		
		
		public void updatePetName() throws Exception {
			String step = "When I run Update Pet Name api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.updatePetName()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		
		
		public void verifyPetName() throws Exception {
			String step = "Then I should verify sucessful Update Pet Name api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verifyPetName()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		
		public void deletePet() throws Exception {
			String step = "When I run Delete Pet api test";
			String keyword = "When";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.deletePet()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
		
		
		public void verifyDeletePet() throws Exception {
			String step = "Then I should verify sucessful Delete Pet api test";
			String keyword = "Then";
			stepPass = true;
			if (CommonMethods.isStepFail()) {
				CommonMethods.LOGGEROnSkip(keyword, step);
			} else {
				try {
					if (!communityApiMethods.verifyDeletePet()) {
						stepPass = false;
						throw new Exception(CommonMethods.getException());
					}
				} catch (Exception e) {
					stepPass = false;
					CommonMethods.setException(e.toString());
				} finally {
					if (stepPass == true) {
						CommonMethods.LOGGEROnPass(keyword, step);
					} else {
						CommonMethods.setStepFail(true);
						CommonMethods.setScenarioResult(false);
						CommonMethods.LOGGEROnFail(keyword, step, CommonMethods.getException());
					}
				}
			}
		}	
}











