package com.board.domain;

public class AttachDTO extends CommonDTO{
	//파일 처리를 위한 AttachDTO
	
	private Long idx;
	private Long boardIdx;
	private String originalName;
	private String saveName;
	private long size;
	public Long getIdx() {
		return idx;
	}
	public void setIdx(Long idx) {
		this.idx = idx;
	}
	public Long getBoardIdx() {
		return boardIdx;
	}
	public void setBoardIdx(Long boardIdx) {
		this.boardIdx = boardIdx;
	}
	public String getOriginalName() {
		return originalName;
	}
	public void setOriginalName(String originalName) {
		this.originalName = originalName;
	}
	public String getSaveName() {
		return saveName;
	}
	public void setSaveName(String saveName) {
		this.saveName = saveName;
	}
	public long getSize() {
		return size;
	}
	public void setSize(long size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return "AttachDTO [idx=" + idx + ", boardIdx=" + boardIdx + ", originalName=" + originalName + ", saveName="
				+ saveName + ", size=" + size + "]";
	}
	
	
	
	
}
