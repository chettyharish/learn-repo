package DataStructures;

class BSTNode {
	int value;
	BSTNode rightNode;
	BSTNode leftNode;
}

class BST {

	BSTNode rootOfTree = null;

	public void insertintoBST(int value) {
		BSTNode markedNode = rootOfTree;
		if (rootOfTree == null) {
			BSTNode newNode = new BSTNode();
			newNode.value = value;
			rootOfTree = newNode;
			newNode.rightNode = null;
			newNode.leftNode = null;
		} else {
			while (true) {
				if (value >= markedNode.value) {

					if (markedNode.rightNode != null) {
						markedNode = markedNode.rightNode;

					} else {
						BSTNode newNode = new BSTNode();
						newNode.value = value;
						markedNode.rightNode = newNode;
						newNode.rightNode = null;
						newNode.leftNode = null;
						break;
					}
				}

				if (value < markedNode.value) {

					if (markedNode.leftNode != null) {
						markedNode = markedNode.leftNode;

					} else {
						BSTNode newNode = new BSTNode();
						newNode.value = value;
						markedNode.leftNode = newNode;
						newNode.rightNode = null;
						newNode.leftNode = null;
						break;
					}
				}
			}
		}
	}

	public void searchBST(int value) {
		BSTNode markedNode = rootOfTree;
		if (rootOfTree == null) {
			System.out.println("Element Not Found");
		} else {
			while (true) {
				if (value > markedNode.value) {
					if (markedNode.rightNode != null) {
						markedNode = markedNode.rightNode;
					} else {
						System.out.println("Element Not Found");
						break;
					}
				}

				if (value < markedNode.value) {
					if (markedNode.leftNode != null) {
						markedNode = markedNode.leftNode;
					} else {
						System.out.println("Element Not Found");
						break;
					}
				}

				if (value == markedNode.value) {
					System.out.println("Element  Found");
					break;
				}

			}
		}
	}

	public void deleteFromBST(int value) {
		BSTNode markedNode = rootOfTree;
		BSTNode minValueNode = null;
		if (rootOfTree == null) {
			System.out.println("Element Not Found");
			return;
		}
		if (rootOfTree.value == value) {
			if (rootOfTree.leftNode == null && rootOfTree.rightNode == null) {
				rootOfTree = null;
				return;
			} else if (rootOfTree.leftNode == null
					^ rootOfTree.rightNode == null) {

				if (rootOfTree.rightNode != null) {
					rootOfTree = rootOfTree.rightNode;
					return;
				} else {
					rootOfTree = rootOfTree.leftNode;
					return;
				}
			} else {
				minValueNode = rootOfTree.rightNode;
				if (minValueNode.leftNode == null) {
					rootOfTree.rightNode.leftNode = rootOfTree.leftNode;
					rootOfTree = rootOfTree.rightNode;
				} else {
					while (true) {
						if (minValueNode.leftNode.leftNode != null) {
							minValueNode = minValueNode.leftNode;
						} else {
							break;
						}
					}

					// Minvalue to the left of minvalue node

					rootOfTree.value = minValueNode.leftNode.value;
					// The value has been swapped
					if (minValueNode.leftNode.leftNode == null
							&& minValueNode.leftNode.rightNode == null) {
						minValueNode.leftNode = null;
					} else {

						if (minValueNode.leftNode.leftNode != null) {
							minValueNode.leftNode = minValueNode.leftNode.leftNode;
						} else {
							minValueNode.leftNode = minValueNode.leftNode.rightNode;
						}

						// Minvalue deleted

					}
				}
			}
		} else {
			while (true) {
				if (value > markedNode.value) {
					if (markedNode.rightNode != null) {
						if (markedNode.rightNode.value == value) {
							break;
						} else {
							markedNode = markedNode.rightNode;
						}
					} else {
						System.out.println("Element Not Found");
						return;
					}

				}

				if (value < markedNode.value) {
					if (markedNode.leftNode != null) {
						if (markedNode.leftNode.value == value) {
							break;
						} else {
							markedNode = markedNode.leftNode;
						}
					} else {
						System.out.println("Element Not Found");
						return;
					}

				}
			}
			// Parent of the required element found

			// ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			if (markedNode.rightNode != null) {
				if (markedNode.rightNode.value == value) {
					if (markedNode.rightNode.rightNode == null
							&& markedNode.rightNode.leftNode == null) {
						markedNode.rightNode = null;
						return;
					} else if (markedNode.rightNode.rightNode == null
							^ markedNode.rightNode.leftNode == null) {
						if (markedNode.rightNode.rightNode != null) {
							markedNode.rightNode = markedNode.rightNode.rightNode;
							return;
						} else {
							markedNode.rightNode = markedNode.rightNode.leftNode;
							return;
						}
					} else {
						if (markedNode.rightNode.value == value) {
							minValueNode = markedNode.rightNode.rightNode;
						} else {
							minValueNode = markedNode.leftNode.rightNode;
						}

						if (minValueNode.leftNode == null) {
							// MinNode has no left value
							markedNode.rightNode = minValueNode;
							return;

						} else {

							while (true) {
								if (minValueNode.leftNode.leftNode != null) {
									minValueNode = minValueNode.leftNode;
								} else {
									break;
								}
							}

							// Minvalue to the left of minvalue node

							if (markedNode.leftNode != null) {
								if (markedNode.leftNode.value == value) {
									markedNode.leftNode.value = minValueNode.leftNode.value;
								}
							}
							if (markedNode.rightNode != null) {
								if (markedNode.rightNode.value == value) {
									markedNode.rightNode.value = minValueNode.leftNode.value;
								}
							}

							// MarkedNode exchanged
							if (minValueNode.leftNode.leftNode == null
									&& minValueNode.leftNode.rightNode == null) {
								minValueNode.leftNode = null;
							} else {

								if (minValueNode.leftNode.leftNode != null) {
									minValueNode.leftNode = minValueNode.leftNode.leftNode;
								} else {
									minValueNode.leftNode = minValueNode.leftNode.rightNode;
								}

								// Minvalue deleted

							}
						}
					}

					// ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
					if (markedNode.leftNode != null) {
						if (markedNode.leftNode.value == value) {
							if (markedNode.leftNode.rightNode == null
									&& markedNode.leftNode.leftNode == null) {
								markedNode.leftNode = null;
								return;
							} else if (markedNode.leftNode.rightNode == null
									^ markedNode.leftNode.leftNode == null) {
								if (markedNode.leftNode.rightNode != null) {
									markedNode.leftNode = markedNode.leftNode.rightNode;
									return;
								} else {
									markedNode.leftNode = markedNode.leftNode.leftNode;
									return;
								}
							} else {
								if (markedNode.rightNode.value == value) {
									minValueNode = markedNode.rightNode.rightNode;
								} else {
									minValueNode = markedNode.leftNode.rightNode;
								}

								if (minValueNode.leftNode == null) {
									// MinNode has no left value
	
									markedNode.leftNode = minValueNode;
									return;

								} else {

									while (true) {
										if (minValueNode.leftNode.leftNode != null) {
											minValueNode = minValueNode.leftNode;
										} else {
											break;
										}
									}

									// Minvalue to the left of minvalue node

									if (markedNode.leftNode != null) {
										if (markedNode.leftNode.value == value) {
											markedNode.leftNode.value = minValueNode.leftNode.value;
										}
									}
									if (markedNode.rightNode != null) {
										if (markedNode.rightNode.value == value) {
											markedNode.rightNode.value = minValueNode.leftNode.value;
										}
									}

									// MarkedNode exchanged

									if (minValueNode.leftNode.leftNode == null
											&& minValueNode.leftNode.rightNode == null) {
										minValueNode.leftNode = null;
									} else {

										if (minValueNode.leftNode.leftNode != null) {
											minValueNode.leftNode = minValueNode.leftNode.leftNode;
										} else {
											minValueNode.leftNode = minValueNode.leftNode.rightNode;
										}

										// Minvalue deleted

									}

								}
							}
						}

						// ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

					}
				}
			}
		}
	}

}

public class BSTImplementation {

	public static void main(String[] args) {
		BST newBst = new BST();
		newBst.insertintoBST(19);
		newBst.insertintoBST(13);
		newBst.insertintoBST(10);
		newBst.insertintoBST(20);
		newBst.insertintoBST(5);
		newBst.insertintoBST(23);
		newBst.insertintoBST(28);
		newBst.insertintoBST(16);
		newBst.insertintoBST(27);
		newBst.insertintoBST(9);
		newBst.insertintoBST(4);
		newBst.insertintoBST(22);
		newBst.insertintoBST(17);
		newBst.insertintoBST(30);
		newBst.insertintoBST(40);
		


	
		newBst.deleteFromBST(5);
		newBst.deleteFromBST(4);
		newBst.deleteFromBST(9);
		newBst.deleteFromBST(10);
		newBst.deleteFromBST(13);
		newBst.deleteFromBST(16);
		newBst.deleteFromBST(17);

		

		newBst.searchBST(5);
		newBst.searchBST(4);
		newBst.searchBST(9);
		newBst.searchBST(10);
		newBst.searchBST(13);
		newBst.searchBST(16);
		newBst.searchBST(17);
		
		System.out.println();
		
		newBst.deleteFromBST(20);
		newBst.deleteFromBST(23);
		newBst.deleteFromBST(27);
		newBst.deleteFromBST(28);
		newBst.deleteFromBST(30);
		newBst.deleteFromBST(40);
		
		newBst.searchBST(20);
		newBst.searchBST(23);
		newBst.searchBST(27);
		newBst.searchBST(28);
		newBst.searchBST(30);
		newBst.searchBST(40);

		
		


	}

}
