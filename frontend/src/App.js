function App() {
  return (
    <div>
      <h1>Samsung AC Controller</h1>
      <button onClick={() => fetch('/api/ac/on', { method: 'POST' })}>Turn On</button>
      <button onClick={() => fetch('/api/ac/off', { method: 'POST' })}>Turn Off</button>
      <form onSubmit={(e) => {
        e.preventDefault();
        const temp = e.target.elements.temp.value;
        fetch(`/api/ac/temp?temperature=${temp}`, { method: 'POST' });
      }}>
        <input name="temp" type="number" placeholder="Set Temp" />
        <button type="submit">Set Temperature</button>
      </form>
    </div>
  );
}

export default App;
