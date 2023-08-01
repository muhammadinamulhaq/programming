export const ClickHandler = () => {
  const clickHandler = (event, count = 1) => {
    console.log('button clicked', count, event)
  }
  return (
    <div>
      <button onClick={clickHandler}>Click</button>
      <button onClick={(e) => clickHandler(e, 5)}>Click 5</button>
    </div>
  )
}
